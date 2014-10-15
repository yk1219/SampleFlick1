package jp.com.drecom.sampleflick1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);
		viewPager.setAdapter(new ImageViewPager(this));
		
	}
	public class ImageViewPager extends PagerAdapter{

		int[] mResIds = {
				R.drawable.img1,
				R.drawable.img2,
				R.drawable.img3,
				R.drawable.img4,
				R.drawable.img5,
				R.drawable.img6,
				R.drawable.img7,
				R.drawable.img8,
				R.drawable.img9,
				R.drawable.img10,
		};
		
		Context mContext;

		ImageViewPager(Context context){
			this.mContext = context;

		}
		
		@Override
		public Object instantiateItem(ViewGroup container , int position){
			ImageView imageView = new ImageView(mContext);
			imageView.setImageResource(mResIds[position]);
			container.addView(imageView);
			return imageView;

		}
		@Override
		public void destroyItem(ViewGroup container , int position ,Object object){
			container.removeView((View) object);
			
		}
		
		@Override
		public int getCount(){
			return mResIds.length;

		}
		
		@Override
		public boolean isViewFromObject(View view , Object object){
			boolean equals = view.equals(object);
			return equals;
		}
	}
}
