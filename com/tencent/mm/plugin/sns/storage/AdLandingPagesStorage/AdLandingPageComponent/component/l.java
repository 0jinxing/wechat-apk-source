package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class l extends h
{
  CircularImageView qZE;

  public l(Context paramContext, n paramn, ViewGroup paramViewGroup)
  {
    super(paramContext, paramn, paramViewGroup);
  }

  public final void cpk()
  {
    this.qZE = ((CircularImageView)this.contentView);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37099);
    if ((this.contentView == null) || (this.qZE == null))
      AppMethodBeat.o(37099);
    while (true)
    {
      return;
      n localn = (n)this.qZo;
      if (localn == null)
      {
        AppMethodBeat.o(37099);
      }
      else
      {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.a(localn.qWD, localn.qWP, new f.a()
        {
          public final void YJ(String paramAnonymousString)
          {
            AppMethodBeat.i(37096);
            try
            {
              localBitmap = BitmapFactory.decodeFile(paramAnonymousString);
              paramAnonymousString = l.this;
              if (localBitmap == null)
              {
                ab.e("AdLandingPageCircleImgComp", "when set image the bmp is null!");
                AppMethodBeat.o(37096);
              }
              while (true)
              {
                return;
                if (paramAnonymousString.qZE != null)
                  break;
                ab.e("AdLandingPageCircleImgComp", "when set image the img is null!");
                AppMethodBeat.o(37096);
              }
            }
            catch (Exception paramAnonymousString)
            {
              while (true)
              {
                Bitmap localBitmap;
                ab.e("AdLandingPageCircleImgComp", "%s" + bo.l(paramAnonymousString));
                AppMethodBeat.o(37096);
                continue;
                if (localBitmap.getWidth() == 0)
                {
                  ab.e("AdLandingPageCircleImgComp", "when set image the bmp.getWidth is 0!");
                  AppMethodBeat.o(37096);
                }
                else
                {
                  paramAnonymousString.qZE.setImageBitmap(localBitmap);
                  AppMethodBeat.o(37096);
                }
              }
            }
          }

          public final void cmD()
          {
          }

          public final void cpu()
          {
          }
        });
        AppMethodBeat.o(37099);
      }
    }
  }

  protected final void cpq()
  {
    AppMethodBeat.i(37097);
    ViewGroup.LayoutParams localLayoutParams = this.contentView.getLayoutParams();
    if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
      ((ViewGroup.MarginLayoutParams)localLayoutParams).setMargins((int)this.qZo.qWS, (int)this.qZo.qWQ, (int)this.qZo.qWT, (int)this.qZo.qWR);
    this.contentView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(37097);
  }

  protected final View cpr()
  {
    AppMethodBeat.i(37098);
    CircularImageView localCircularImageView = new CircularImageView(this.context);
    AppMethodBeat.o(37098);
    return localCircularImageView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l
 * JD-Core Version:    0.6.2
 */