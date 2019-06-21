package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import org.json.JSONException;
import org.json.JSONObject;

public final class w extends h
{
  private ImageView cAw;
  ProgressBar progressBar;
  boolean qWC;
  boolean qZh = true;

  public w(Context paramContext, n paramn, ViewGroup paramViewGroup)
  {
    super(paramContext, paramn, paramViewGroup);
  }

  public final boolean Y(Bitmap paramBitmap)
  {
    boolean bool = false;
    AppMethodBeat.i(37270);
    if (paramBitmap == null)
    {
      ab.e("AdLandingPagePureImageComponet", "when set image the bmp is null!");
      AppMethodBeat.o(37270);
    }
    while (true)
    {
      return bool;
      if (this.cAw == null)
      {
        ab.e("AdLandingPagePureImageComponet", "when set image the imageView is null!");
        AppMethodBeat.o(37270);
      }
      else if (paramBitmap.getWidth() == 0)
      {
        ab.e("AdLandingPagePureImageComponet", "when set image the bmp.getWidth is 0!");
        AppMethodBeat.o(37270);
      }
      else
      {
        this.cAw.setImageBitmap(paramBitmap);
        this.progressBar.setVisibility(8);
        bool = true;
        AppMethodBeat.o(37270);
      }
    }
  }

  public final boolean al(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(37271);
    boolean bool;
    if (!super.al(paramJSONObject))
    {
      AppMethodBeat.o(37271);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        if (!this.qZh)
        {
          String str = ag.ck(((n)this.qZo).qWD);
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("imgUrlInfo", localJSONObject);
        }
        AppMethodBeat.o(37271);
        bool = true;
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace("AdLandingPagePureImageComponet", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(37271);
        bool = false;
      }
    }
  }

  public final void cpk()
  {
    AppMethodBeat.i(37266);
    this.cAw = ((ImageView)this.contentView.findViewById(2131827632));
    this.progressBar = ((ProgressBar)this.contentView.findViewById(2131821219));
    AppMethodBeat.o(37266);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37268);
    if ((this.contentView == null) || (this.cAw == null) || (this.progressBar == null))
      AppMethodBeat.o(37268);
    while (true)
    {
      return;
      if ((n)this.qZo == null)
      {
        AppMethodBeat.o(37268);
        continue;
      }
      String str = ((n)this.qZo).qWD;
      Object localObject = ((n)this.qZo).qWE;
      float f1 = ((n)this.qZo).height;
      float f2 = ((n)this.qZo).width;
      this.qWC = ((n)this.qZo).qWC;
      int i;
      if ((f1 != 0.0F) && (f2 != 0.0F) && (!this.qWC))
      {
        i = this.ieu - (int)((n)this.qZo).qWS - (int)((n)this.qZo).qWT;
        if (f2 < i)
        {
          label168: f1 = f2 * ((n)this.qZo).height / ((n)this.qZo).width;
          this.cAw.setLayoutParams(new RelativeLayout.LayoutParams((int)f2, (int)f1));
          label212: if ((localObject == null) || (((String)localObject).length() <= 0));
        }
      }
      try
      {
        this.cAw.setBackgroundColor(Color.parseColor((String)localObject));
        label234: if ((str == null) || (str.length() <= 0))
        {
          ab.i("AdLandingPagePureImageComponet", "Pure image component fillItem without imageurl.");
          AppMethodBeat.o(37268);
          continue;
          f2 = i;
          break label168;
          if ((this.qWC) && (f1 != 0.0F) && (f2 != 0.0F))
          {
            this.cAw.setLayoutParams(new RelativeLayout.LayoutParams(this.ieu, this.iev));
            break label212;
          }
          this.cAw.setLayoutParams(new RelativeLayout.LayoutParams(this.ieu, this.iev));
          break label212;
        }
        localObject = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.gm("adId", str);
        if ((localObject != null) && (Y((Bitmap)localObject)))
        {
          ab.i("AdLandingPagePureImageComponet", "loaded cached image with  ".concat(String.valueOf(str)));
          this.qZh = true;
          AppMethodBeat.o(37268);
          continue;
        }
        this.qZh = false;
        startLoading();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.a(str, ((n)this.qZo).qWP, new w.1(this));
        AppMethodBeat.o(37268);
      }
      catch (Exception localException)
      {
        break label234;
      }
    }
  }

  protected final void cpq()
  {
    AppMethodBeat.i(37267);
    Object localObject = this.contentView.getLayoutParams();
    if ((localObject instanceof ViewGroup.MarginLayoutParams))
    {
      localObject = (ViewGroup.MarginLayoutParams)localObject;
      ((ViewGroup.MarginLayoutParams)localObject).setMargins((int)((n)this.qZo).qWS, (int)((n)this.qZo).qWQ, (int)((n)this.qZo).qWT, (int)((n)this.qZo).qWR);
      this.contentView.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    AppMethodBeat.o(37267);
  }

  protected final int getLayout()
  {
    return 2130970728;
  }

  public final void startLoading()
  {
    AppMethodBeat.i(37269);
    this.progressBar.setVisibility(0);
    AppMethodBeat.o(37269);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w
 * JD-Core Version:    0.6.2
 */