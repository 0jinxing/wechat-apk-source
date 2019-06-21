package com.tencent.mm.plugin.webview.luggage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.b.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.a.c;
import org.json.JSONArray;

public class k extends LinearLayout
{
  private TextView iDT;
  private ImageView kiE;
  protected Context mContext;
  private String mTitle;
  private d uiI;
  private ImageView uiY;
  private TextView uiZ;
  private n uja;
  protected l ujb;
  private r ujc;
  public c ujd;
  private boolean uje;
  private View.OnClickListener ujf;

  public k(d paramd)
  {
    super(paramd.mContext);
    AppMethodBeat.i(6181);
    this.ujd = null;
    this.uje = false;
    this.ujf = new k.8(this);
    this.mContext = paramd.mContext;
    this.uiI = paramd;
    setLayoutParams(new LinearLayout.LayoutParams(-1, getActionBarHeight()));
    setBackgroundResource(2131689639);
    View localView = v.hu(getContext()).inflate(2130971208, this, false);
    addView(localView);
    this.kiE = ((ImageView)localView.findViewById(2131822906));
    this.kiE.setOnClickListener(new k.1(this));
    this.iDT = ((TextView)localView.findViewById(2131820678));
    this.uiY = ((ImageView)localView.findViewById(2131822907));
    this.uiY.setOnClickListener(new k.2(this, paramd));
    this.uiY.setClickable(false);
    this.uiZ = ((TextView)localView.findViewById(2131829162));
    this.uiZ.setOnClickListener(new k.3(this, paramd));
    this.uiZ.setClickable(false);
    AppMethodBeat.o(6181);
  }

  private int getActionBarHeight()
  {
    AppMethodBeat.i(6188);
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels);
    for (int i = this.mContext.getResources().getDimensionPixelSize(2131427562); ; i = this.mContext.getResources().getDimensionPixelSize(2131427563))
    {
      AppMethodBeat.o(6188);
      return i;
    }
  }

  public final void H(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(6192);
    if (paramJSONArray != null)
      for (int i = 0; i < paramJSONArray.length(); i++)
        getMenuHelp().aeg(paramJSONArray.optString(i));
    AppMethodBeat.o(6192);
  }

  public final void I(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(6193);
    if (paramJSONArray != null)
      for (int i = 0; i < paramJSONArray.length(); i++)
        getMenuHelp().aeh(paramJSONArray.optString(i));
    AppMethodBeat.o(6193);
  }

  public final void bD(int paramInt, String paramString)
  {
    AppMethodBeat.i(6196);
    setBackgroundColor(paramInt);
    if (bo.nullAsNil(paramString).equals("black"))
    {
      this.iDT.setTextColor(-16777216);
      this.kiE.setColorFilter(-16777216);
      if (this.uje)
        break label95;
      this.uiY.setImageResource(2131230740);
      AppMethodBeat.o(6196);
    }
    while (true)
    {
      return;
      this.iDT.setTextColor(-1);
      this.kiE.clearColorFilter();
      if (!this.uje)
        this.uiY.setImageResource(2131230747);
      label95: AppMethodBeat.o(6196);
    }
  }

  public void bDx()
  {
    AppMethodBeat.i(6189);
    if (!this.uiI.bPe.xi().xb())
      ((Activity)this.mContext).finish();
    AppMethodBeat.o(6189);
  }

  public void bDy()
  {
    AppMethodBeat.i(6186);
    boolean bool = false;
    if ((getContext() instanceof MMActivity))
      bool = ((MMActivity)getContext()).mController.hideVKB();
    k.4 local4 = new k.4(this);
    if (bool);
    for (long l = 100L; ; l = 0L)
    {
      al.n(local4, l);
      AppMethodBeat.o(6186);
      return;
    }
  }

  public void bDz()
  {
    AppMethodBeat.i(6187);
    if (this.uja != null)
      this.uja.cXg();
    AppMethodBeat.o(6187);
  }

  public final boolean cWG()
  {
    boolean bool = true;
    AppMethodBeat.i(6195);
    if ((this.ujc != null) && (this.ujc.cXi()))
    {
      Object localObject1 = this.ujc.cXj();
      String str1 = this.ujc.cXk();
      String str2 = this.ujc.cXl();
      ab.i("MicroMsg.GameWebViewActionBar", "use js api close window confirm info : %s, %s, %s", new Object[] { localObject1, str1, str2 });
      View localView = View.inflate(getContext(), 2130970090, null);
      Object localObject2 = (CheckBox)localView.findViewById(2131825970);
      ((CheckBox)localObject2).setChecked(false);
      ((CheckBox)localObject2).setVisibility(8);
      localObject2 = (TextView)localView.findViewById(2131825969);
      ((TextView)localObject2).setText((CharSequence)localObject1);
      ((TextView)localObject2).setTextColor(getResources().getColor(2131690316));
      localObject1 = (TextView)localView.findViewById(2131825971);
      ((TextView)localObject1).setTextColor(getResources().getColor(2131690316));
      ((TextView)localObject1).setVisibility(8);
      this.ujd = com.tencent.mm.ui.base.h.a(getContext(), true, "", localView, str1, str2, new k.5(this), new k.6(this));
      AppMethodBeat.o(6195);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(6195);
      bool = false;
    }
  }

  public final void cXc()
  {
    AppMethodBeat.i(6190);
    getMenuHelp().cXc();
    AppMethodBeat.o(6190);
  }

  public final void cXd()
  {
    AppMethodBeat.i(6191);
    getMenuHelp().cXd();
    AppMethodBeat.o(6191);
  }

  protected l getMenuHelp()
  {
    AppMethodBeat.i(6185);
    if (this.ujb == null)
      this.ujb = new l();
    l locall = this.ujb;
    AppMethodBeat.o(6185);
    return locall;
  }

  public String getTitle()
  {
    return this.mTitle;
  }

  public void setCloseWindowConfirmInfo(Bundle paramBundle)
  {
    AppMethodBeat.i(6194);
    if (paramBundle == null);
    for (paramBundle = null; ; paramBundle = new r(paramBundle))
    {
      this.ujc = paramBundle;
      AppMethodBeat.o(6194);
      return;
    }
  }

  public void setNavigationBarButtons(final Bundle paramBundle)
  {
    Object localObject = null;
    AppMethodBeat.i(6197);
    if (paramBundle == null)
      AppMethodBeat.o(6197);
    while (true)
    {
      return;
      String str1 = paramBundle.getString("set_navigation_bar_buttons_left_text_color");
      final boolean bool1 = paramBundle.getBoolean("set_navigation_bar_buttons_hide_right_button", false);
      final String str2 = paramBundle.getString("set_navigation_bar_buttons_text");
      String str3 = paramBundle.getString("set_navigation_bar_buttons_icon_data");
      String str4 = paramBundle.getString("set_navigation_bar_buttons_text_color");
      final boolean bool2 = paramBundle.getBoolean("set_navigation_bar_buttons_need_click_event", false);
      final int i = com.tencent.mm.plugin.webview.ui.tools.g.bx(str1, -1);
      final int j = (int)com.tencent.mm.plugin.webview.ui.tools.g.afy(str4);
      paramBundle = localObject;
      if (!bo.isNullOrNil(str3));
      try
      {
        paramBundle = com.tencent.mm.plugin.webview.ui.tools.g.afz(str3);
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(6178);
            if ((k.this == null) || (k.a(k.this) == null))
            {
              AppMethodBeat.o(6178);
              return;
            }
            if (bool1)
              k.a(k.this, true);
            while (true)
            {
              Drawable localDrawable = k.this.getResources().getDrawable(2131230739).mutate();
              localDrawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
              if (k.f(k.this) != null)
                k.f(k.this).setImageDrawable(localDrawable);
              AppMethodBeat.o(6178);
              break;
              k.a(k.this, false);
              if ((k.c(k.this) == null) || (k.d(k.this) == null))
              {
                AppMethodBeat.o(6178);
                break;
              }
              k.b(k.this, false);
              if ((paramBundle != null) && (!paramBundle.isRecycled()))
              {
                k.c(k.this).setVisibility(0);
                k.c(k.this).setImageBitmap(paramBundle);
                k.d(k.this).setVisibility(8);
                k.b(k.this, true);
                if (bool2)
                  k.c(k.this).setOnClickListener(k.e(k.this));
              }
              else if (!bo.isNullOrNil(str2))
              {
                k.c(k.this).setVisibility(8);
                k.d(k.this).setVisibility(0);
                k.d(k.this).setText(str2);
                if (j != -1)
                  k.d(k.this).setTextColor(j);
                if (bool2)
                  k.d(k.this).setOnClickListener(k.e(k.this));
              }
              else
              {
                k.c(k.this).setVisibility(0);
                k.c(k.this).setImageResource(2131230740);
                k.d(k.this).setVisibility(8);
                if (bool2)
                  k.c(k.this).setOnClickListener(k.e(k.this));
              }
            }
          }
        });
        AppMethodBeat.o(6197);
      }
      catch (Exception paramBundle)
      {
        while (true)
        {
          ab.e("MicroMsg.GameWebViewActionBar", "setNavigationBarButtons, decode base64 image, exception = %s", new Object[] { paramBundle });
          paramBundle = localObject;
        }
      }
    }
  }

  public void setOptionEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(6182);
    if (paramBoolean)
    {
      this.uiY.setClickable(true);
      this.uiZ.setClickable(true);
      AppMethodBeat.o(6182);
    }
    while (true)
    {
      return;
      this.uiY.setClickable(false);
      this.uiZ.setClickable(false);
      AppMethodBeat.o(6182);
    }
  }

  public void setTitleColor(int paramInt)
  {
    AppMethodBeat.i(6184);
    this.iDT.setTextColor(paramInt);
    AppMethodBeat.o(6184);
  }

  public void setTitleText(String paramString)
  {
    AppMethodBeat.i(6183);
    ab.d("MicroMsg.GameWebViewActionBar", "setTitleText, title: %s", new Object[] { paramString });
    this.mTitle = paramString;
    this.iDT.setText(paramString);
    AppMethodBeat.o(6183);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.k
 * JD-Core Version:    0.6.2
 */