package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class t extends k
{
  public t(Context paramContext, j paramj, ViewGroup paramViewGroup)
  {
    super(paramContext, paramj, paramViewGroup);
  }

  private boolean cpO()
  {
    AppMethodBeat.i(37242);
    boolean bool;
    if (((j)cpI()).qWi == 1)
    {
      AppMethodBeat.o(37242);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37242);
    }
  }

  private boolean cpP()
  {
    AppMethodBeat.i(37243);
    boolean bool;
    if (((j)cpI()).qWj == 1)
    {
      AppMethodBeat.o(37243);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37243);
    }
  }

  public final void b(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(37241);
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_landig_pages_from_source", 14);
    localIntent.putExtra("sns_landig_pages_origin_from_source", cpC().qXp);
    localIntent.putExtra("sns_landing_pages_xml", "");
    if (cpP())
    {
      localIntent.putExtra("sns_landing_pages_canvasid", paramString1);
      localIntent.putExtra("sns_landing_pages_canvas_ext", paramString2);
    }
    while (true)
    {
      if (cpO())
      {
        paramString1 = new int[2];
        this.qZB.getLocationOnScreen(paramString1);
        localIntent.putExtra("img_gallery_top", paramString1[1]);
        localIntent.putExtra("img_gallery_left", paramString1[0]);
        localIntent.putExtra("img_gallery_width", this.qZB.getWidth());
        localIntent.putExtra("img_gallery_height", this.qZB.getHeight());
      }
      localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", cpO());
      localIntent.putExtra("sns_landing_pages_extra", "");
      localIntent.putExtra("sns_landing_pages_no_store", paramInt);
      localIntent.putExtra("sns_landing_pages_ux_info", cpC().qPj);
      localIntent.putExtra("sns_landing_is_native_sight_ad", cpC().qXq);
      String str1;
      String str2;
      JSONObject localJSONObject;
      if (((paramContext instanceof Activity)) && (cpP()) && (cpC().qXr == 2))
      {
        str1 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_sessionId");
        paramString2 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
        if (!bo.isNullOrNil(str1))
        {
          str2 = String.valueOf(System.currentTimeMillis() / 1000L);
          localJSONObject = new JSONObject();
        }
      }
      try
      {
        localJSONObject.put("sessionId", str2);
        localJSONObject.put("cid", cpI().qWO);
        if (!bo.isNullOrNil(paramString2));
        for (paramString1 = paramString2; ; paramString1 = "")
        {
          localJSONObject.put("adBuffer", paramString1);
          localJSONObject.put("preSessionId", str1);
          label341: localIntent.putExtra("sns_landing_pages_search_extra", localJSONObject.toString());
          localIntent.putExtra("sns_landing_pages_sessionId", str2);
          localIntent.putExtra("sns_landing_pages_ad_buffer", paramString2);
          if ((paramContext instanceof Activity))
          {
            paramString2 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_rawSnsId");
            paramString1 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_share_sns_id");
            localIntent.putExtra("sns_landing_pages_rawSnsId", paramString2);
            localIntent.putExtra("sns_landing_pages_share_sns_id", paramString1);
          }
          d.b(paramContext, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", localIntent);
          AppMethodBeat.o(37241);
          return;
          localIntent.putExtra("sns_landing_pages_pageid", bo.anl(paramString1));
          break;
        }
      }
      catch (Exception paramString1)
      {
        break label341;
      }
    }
  }

  protected final void e(Button paramButton)
  {
    AppMethodBeat.i(37240);
    paramButton.setOnClickListener(new t.1(this));
    AppMethodBeat.o(37240);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t
 * JD-Core Version:    0.6.2
 */