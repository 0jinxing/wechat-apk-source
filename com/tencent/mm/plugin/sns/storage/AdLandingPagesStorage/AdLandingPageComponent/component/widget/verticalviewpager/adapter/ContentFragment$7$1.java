package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h;
import com.tencent.mm.sdk.platformtools.ab;

final class ContentFragment$7$1
  implements ViewTreeObserver.OnPreDrawListener
{
  ContentFragment$7$1(ContentFragment.7 param7)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(37624);
    if (ContentFragment.a(this.rdv.rdr).rdz.getHeight() > 0)
    {
      ContentFragment.a(this.rdv.rdr).rdz.getViewTreeObserver().removeOnPreDrawListener(this);
      ContentFragment.b(this.rdv.rdr, ContentFragment.a(this.rdv.rdr).rdz.getHeight());
      if (ContentFragment.l(this.rdv.rdr) < ContentFragment.f(this.rdv.rdr))
        ContentFragment.b(this.rdv.rdr, ContentFragment.f(this.rdv.rdr));
      Object localObject = (FrameLayout.LayoutParams)ContentFragment.a(this.rdv.rdr).rdw.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).height = ContentFragment.l(this.rdv.rdr);
      ContentFragment.a(this.rdv.rdr).rdw.setLayoutParams((ViewGroup.LayoutParams)localObject);
      ab.i("ContentFragment", "set bgIV height " + ContentFragment.a(this.rdv.rdr).rdz.getHeight() + ", count " + ContentFragment.a(this.rdv.rdr).rdz.getChildCount());
      for (int i = 0; i < ContentFragment.a(this.rdv.rdr).rdz.getChildCount(); i++)
      {
        localObject = ContentFragment.a(this.rdv.rdr).rdz.getChildAt(i).getTag();
        if ((localObject instanceof h))
          ((h)localObject).coZ();
      }
      ContentFragment.a(this.rdv.rdr).rdz.removeAllViews();
      ContentFragment.a(this.rdv.rdr).rdz.setVisibility(8);
    }
    AppMethodBeat.o(37624);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.7.1
 * JD-Core Version:    0.6.2
 */