package android.support.v4.app;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ListFragment extends Fragment
{
  private final Runnable Eg = new ListFragment.1(this);
  private final AdapterView.OnItemClickListener Eh = new ListFragment.2(this);
  ListAdapter Ei;
  ListView Ej;
  View Ek;
  TextView El;
  View Em;
  View En;
  boolean Eo;
  CharSequence mEmptyText;
  private final Handler mHandler = new Handler();

  private void dq()
  {
    if (this.Ej != null)
      return;
    Object localObject = getView();
    if (localObject == null)
      throw new IllegalStateException("Content view not yet created");
    if ((localObject instanceof ListView))
    {
      this.Ej = ((ListView)localObject);
      label42: this.Eo = true;
      this.Ej.setOnItemClickListener(this.Eh);
      if (this.Ei == null)
        break label256;
      localObject = this.Ei;
      this.Ei = null;
      setListAdapter((ListAdapter)localObject);
    }
    while (true)
    {
      this.mHandler.post(this.Eg);
      break;
      this.El = ((TextView)((View)localObject).findViewById(16711681));
      if (this.El == null)
        this.Ek = ((View)localObject).findViewById(16908292);
      while (true)
      {
        this.Em = ((View)localObject).findViewById(16711682);
        this.En = ((View)localObject).findViewById(16711683);
        localObject = ((View)localObject).findViewById(16908298);
        if ((localObject instanceof ListView))
          break label195;
        if (localObject != null)
          break;
        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
        this.El.setVisibility(8);
      }
      throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
      label195: this.Ej = ((ListView)localObject);
      if (this.Ek != null)
      {
        this.Ej.setEmptyView(this.Ek);
        break label42;
      }
      if (this.mEmptyText == null)
        break label42;
      this.El.setText(this.mEmptyText);
      this.Ej.setEmptyView(this.El);
      break label42;
      label256: if (this.Em != null)
        e(false, false);
    }
  }

  private void e(boolean paramBoolean1, boolean paramBoolean2)
  {
    dq();
    if (this.Em == null)
      throw new IllegalStateException("Can't be used with a custom content view");
    if (this.Eo == paramBoolean1)
      return;
    this.Eo = paramBoolean1;
    if (paramBoolean1)
    {
      if (paramBoolean2)
      {
        this.Em.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
        this.En.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
      }
      while (true)
      {
        this.Em.setVisibility(8);
        this.En.setVisibility(0);
        break;
        this.Em.clearAnimation();
        this.En.clearAnimation();
      }
    }
    if (paramBoolean2)
    {
      this.Em.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
      this.En.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
    }
    while (true)
    {
      this.Em.setVisibility(0);
      this.En.setVisibility(8);
      break;
      this.Em.clearAnimation();
      this.En.clearAnimation();
    }
  }

  private void setListAdapter(ListAdapter paramListAdapter)
  {
    boolean bool = false;
    if (this.Ei != null);
    for (int i = 1; ; i = 0)
    {
      this.Ei = paramListAdapter;
      if (this.Ej != null)
      {
        this.Ej.setAdapter(paramListAdapter);
        if ((!this.Eo) && (i == 0))
        {
          if (getView().getWindowToken() != null)
            bool = true;
          e(true, bool);
        }
      }
      return;
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramBundle = getContext();
    paramLayoutInflater = new FrameLayout(paramBundle);
    paramViewGroup = new LinearLayout(paramBundle);
    paramViewGroup.setId(16711682);
    paramViewGroup.setOrientation(1);
    paramViewGroup.setVisibility(8);
    paramViewGroup.setGravity(17);
    paramViewGroup.addView(new ProgressBar(paramBundle, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
    paramLayoutInflater.addView(paramViewGroup, new FrameLayout.LayoutParams(-1, -1));
    paramViewGroup = new FrameLayout(paramBundle);
    paramViewGroup.setId(16711683);
    TextView localTextView = new TextView(paramBundle);
    localTextView.setId(16711681);
    localTextView.setGravity(17);
    paramViewGroup.addView(localTextView, new FrameLayout.LayoutParams(-1, -1));
    paramBundle = new ListView(paramBundle);
    paramBundle.setId(16908298);
    paramBundle.setDrawSelectorOnTop(false);
    paramViewGroup.addView(paramBundle, new FrameLayout.LayoutParams(-1, -1));
    paramLayoutInflater.addView(paramViewGroup, new FrameLayout.LayoutParams(-1, -1));
    paramLayoutInflater.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    return paramLayoutInflater;
  }

  public void onDestroyView()
  {
    this.mHandler.removeCallbacks(this.Eg);
    this.Ej = null;
    this.Eo = false;
    this.En = null;
    this.Em = null;
    this.Ek = null;
    this.El = null;
    super.onDestroyView();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    dq();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ListFragment
 * JD-Core Version:    0.6.2
 */