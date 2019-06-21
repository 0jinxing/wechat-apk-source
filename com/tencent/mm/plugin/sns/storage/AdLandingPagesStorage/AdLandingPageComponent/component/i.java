package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.c;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class i
{
  public String eIq;
  private View jcl;
  public String kWC;
  private Context mContext;
  public String mTitle;
  c qZt;
  private int qZu;
  private int qZv;
  private boolean qZw;
  private boolean qZx;
  public i.a qZy;

  public i(Context paramContext, h paramh, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(37083);
    this.eIq = "";
    this.mTitle = "";
    this.kWC = "";
    this.qZu = -1;
    this.qZv = -1;
    this.qZw = false;
    this.qZx = false;
    this.eIq = paramString1;
    this.mTitle = paramString2;
    this.kWC = paramString3;
    this.mContext = paramContext;
    this.qZw = paramBoolean1;
    this.qZx = paramBoolean2;
    if ((paramh != null) && (paramh.getView() != null))
    {
      this.qZt = new c(paramContext);
      this.qZt.setCanceledOnTouchOutside(true);
      this.jcl = View.inflate(paramContext, 2130970719, null);
      if (this.jcl == null)
      {
        ab.e("MicroMsg.AdLandingPageBottomSheet", "mRootView init fail!");
        AppMethodBeat.o(37083);
      }
    }
    while (true)
    {
      return;
      paramString1 = (LinearLayout)this.jcl.findViewById(2131827625);
      paramContext = paramh.getView();
      if (paramContext.getParent() != null)
        ((ViewGroup)paramContext.getParent()).removeView(paramContext);
      this.qZu = ((int)paramh.cpv().qWU);
      this.qZv = ((int)paramh.cpv().qWV);
      paramh = new LinearLayout.LayoutParams(-1, -1);
      if ((this.qZu != 2147483647) && (this.qZv != 2147483647));
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
        {
          paramh.width = this.qZu;
          paramh.height = this.qZv;
        }
        paramString1.addView(paramContext, paramh);
        ((TextView)this.jcl.findViewById(2131825987)).setText(paramString2);
        paramContext = this.jcl.findViewById(2131827624);
        paramContext.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(37078);
            i.this.qZt.cancel();
            AppMethodBeat.o(37078);
          }
        });
        paramh = this.jcl.findViewById(2131827626);
        paramh.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(37079);
            i.this.qZt.cancel();
            AppMethodBeat.o(37079);
          }
        });
        if (!this.qZx)
          paramh.setVisibility(8);
        if (this.qZw)
          paramContext.setVisibility(8);
        paramContext = (ImageView)this.jcl.findViewById(2131823799);
        paramContext.setVisibility(8);
        if (bo.isNullOrNil(paramString3))
          break label426;
        paramh = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.gm("adId", paramString3);
        if (paramh == null)
          break label411;
        paramContext.setImageBitmap(paramh);
        paramContext.setVisibility(0);
        AppMethodBeat.o(37083);
        break;
      }
      label411: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.a(paramString3, 0, new i.3(this, paramContext));
      label426: AppMethodBeat.o(37083);
    }
  }

  public final void cpD()
  {
    AppMethodBeat.i(37084);
    if ((this.jcl == null) || (this.qZt == null))
      AppMethodBeat.o(37084);
    while (true)
    {
      return;
      this.qZt.getWindow().setFlags(8, 8);
      this.qZt.getWindow().addFlags(131200);
      if (this.qZy != null)
      {
        this.qZt.setOnDismissListener(new i.4(this));
        this.qZt.setOnCancelListener(new i.5(this));
      }
      this.qZt.setContentView(this.jcl);
      BottomSheetBehavior.j((View)this.jcl.getParent()).K(ad.eP(this.mContext)[1]);
      this.qZt.show();
      AppMethodBeat.o(37084);
    }
  }

  public final void cpE()
  {
    AppMethodBeat.i(37085);
    if (this.qZt != null)
      this.qZt.dismiss();
    AppMethodBeat.o(37085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i
 * JD-Core Version:    0.6.2
 */