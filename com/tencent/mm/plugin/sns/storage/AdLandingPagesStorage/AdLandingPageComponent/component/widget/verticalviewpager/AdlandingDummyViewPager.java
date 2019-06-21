package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.content.Context;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

public class AdlandingDummyViewPager extends DummyViewPager
{
  private AdlandingDummyViewPager.a rcQ;
  public Set<ViewPager.OnPageChangeListener> rcR;

  public AdlandingDummyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(37592);
    this.rcQ = new AdlandingDummyViewPager.a(this, (byte)0);
    this.rcR = new HashSet();
    setOnPageChangeListener(this.rcQ);
    AppMethodBeat.o(37592);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager
 * JD-Core Version:    0.6.2
 */