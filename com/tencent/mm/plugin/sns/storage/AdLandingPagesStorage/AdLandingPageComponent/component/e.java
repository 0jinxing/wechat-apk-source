package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends h
{
  ImageView cAw;
  ProgressBar progressBar;
  boolean qZh = true;

  public e(Context paramContext, ViewGroup paramViewGroup)
  {
    this(paramContext, paramViewGroup, (byte)0);
  }

  private e(Context paramContext, ViewGroup paramViewGroup, byte paramByte)
  {
    super(paramContext, null, paramViewGroup);
  }

  public final boolean al(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(37056);
    boolean bool;
    if (!super.al(paramJSONObject))
    {
      AppMethodBeat.o(37056);
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
        AppMethodBeat.o(37056);
        bool = true;
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace("AdLandingImageComp", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(37056);
        bool = false;
      }
    }
  }

  public final void cpk()
  {
    AppMethodBeat.i(37052);
    View localView = this.contentView;
    this.cAw = ((ImageView)localView.findViewById(2131827632));
    this.progressBar = ((ProgressBar)localView.findViewById(2131821219));
    AppMethodBeat.o(37052);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37053);
    if ((this.contentView == null) || (this.cAw == null) || (this.progressBar == null))
      AppMethodBeat.o(37053);
    while (true)
    {
      return;
      if ((n)this.qZo == null)
      {
        AppMethodBeat.o(37053);
      }
      else
      {
        float f1 = ((n)this.qZo).qWQ;
        float f2 = ((n)this.qZo).qWR;
        float f3 = ((n)this.qZo).qWS;
        float f4 = ((n)this.qZo).qWT;
        String str = ((n)this.qZo).qWD;
        float f5 = ((n)this.qZo).height;
        float f6 = ((n)this.qZo).width;
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.cAw.getLayoutParams();
        localLayoutParams.width = ((int)f6);
        localLayoutParams.height = ((int)f5);
        this.cAw.setLayoutParams(localLayoutParams);
        this.qZh = false;
        startLoading();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.a(str, ((n)this.qZo).qWP, new e.1(this));
        this.contentView.setPadding((int)f3, (int)f1, (int)f4, (int)f2);
        AppMethodBeat.o(37053);
      }
    }
  }

  protected final int getLayout()
  {
    return 2130970723;
  }

  public final void startLoading()
  {
    AppMethodBeat.i(37054);
    this.progressBar.setVisibility(0);
    AppMethodBeat.o(37054);
  }

  public final void stopLoading()
  {
    AppMethodBeat.i(37055);
    this.progressBar.setVisibility(8);
    AppMethodBeat.o(37055);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e
 * JD-Core Version:    0.6.2
 */