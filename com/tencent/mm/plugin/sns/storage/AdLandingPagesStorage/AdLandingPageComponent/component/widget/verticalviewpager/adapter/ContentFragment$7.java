package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g;
import com.tencent.mm.plugin.sns.ui.al;
import java.util.LinkedList;

final class ContentFragment$7
  implements Runnable
{
  ContentFragment$7(ContentFragment paramContentFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37625);
    if (ContentFragment.a(this.rdr) == null)
      AppMethodBeat.o(37625);
    while (true)
    {
      return;
      if (((ContentFragment.d(this.rdr).rei) || (!TextUtils.isEmpty(ContentFragment.d(this.rdr).reh))) && (!ContentFragment.j(this.rdr)))
      {
        ContentFragment.k(this.rdr);
        ContentFragment.a(this.rdr).rdz.setVisibility(0);
        ContentFragment.a(this.rdr).rdw.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ContentFragment.a(this.rdr).rdz.getViewTreeObserver().addOnPreDrawListener(new ContentFragment.7.1(this));
        a locala = ContentFragment.m(this.rdr);
        LinearLayout localLinearLayout = ContentFragment.a(this.rdr).rdz;
        for (int i = 0; i < locala.rcX.rej.size(); i++)
        {
          Object localObject = (r)locala.rcX.rej.get(i);
          localObject = al.a(localLinearLayout.getContext(), (r)localObject, localLinearLayout, locala.bgColor);
          if (localObject != null)
          {
            if ((((h)localObject).getView().getParent() != null) && ((((h)localObject).getView().getParent() instanceof ViewGroup)))
              ((ViewGroup)((h)localObject).getView().getParent()).removeView(((h)localObject).getView());
            ((h)localObject).getView().setTag(localObject);
            localLinearLayout.addView(((h)localObject).getView());
          }
        }
      }
      AppMethodBeat.o(37625);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.7
 * JD-Core Version:    0.6.2
 */