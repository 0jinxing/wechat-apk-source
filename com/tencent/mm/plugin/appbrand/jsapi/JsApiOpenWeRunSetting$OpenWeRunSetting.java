package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.compat.a.a;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.sport.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

class JsApiOpenWeRunSetting$OpenWeRunSetting extends MainProcessTask
{
  public static final Parcelable.Creator<OpenWeRunSetting> CREATOR;
  private boolean cPT;
  private int hwi;
  private m hwz;
  private c hxS;
  private boolean hys;
  private boolean hyt;

  static
  {
    AppMethodBeat.i(130539);
    CREATOR = new JsApiOpenWeRunSetting.OpenWeRunSetting.3();
    AppMethodBeat.o(130539);
  }

  public JsApiOpenWeRunSetting$OpenWeRunSetting(Parcel paramParcel)
  {
    AppMethodBeat.i(130532);
    this.hys = false;
    this.cPT = false;
    g(paramParcel);
    AppMethodBeat.o(130532);
  }

  public JsApiOpenWeRunSetting$OpenWeRunSetting(m paramm, c paramc, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(130531);
    this.hys = false;
    this.cPT = false;
    ab.i("MicroMsg.JsApiOpenWeRunSetting", "OpenWeRunSetting");
    this.hwz = paramm;
    this.hxS = paramc;
    this.hwi = paramInt;
    this.hyt = paramBoolean;
    AppMethodBeat.o(130531);
  }

  private void aCk()
  {
    AppMethodBeat.i(130534);
    if ((!this.hyt) || (this.hys))
    {
      this.cPT = ((b)g.K(b.class)).cvY();
      if ((this.hyt) && (this.cPT))
        ((b)g.K(b.class)).cvX();
    }
    aCb();
    AppMethodBeat.o(130534);
  }

  public final void asP()
  {
    AppMethodBeat.i(130533);
    this.hys = ((b)g.K(b.class)).eU(ah.getContext());
    if ((this.hyt) && (!this.hys))
    {
      ((a)g.K(a.class)).a(new JsApiOpenWeRunSetting.OpenWeRunSetting.1(this));
      AppMethodBeat.o(130533);
    }
    while (true)
    {
      return;
      aCk();
      AppMethodBeat.o(130533);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(130535);
    if ((this.hyt) && (!this.hys))
    {
      this.hxS.M(this.hwi, this.hwz.j("fail device not support", null));
      aBW();
      AppMethodBeat.o(130535);
    }
    while (true)
    {
      return;
      if (this.cPT)
      {
        this.hxS.M(this.hwi, this.hwz.j("ok", null));
        aBW();
        AppMethodBeat.o(130535);
      }
      else
      {
        Context localContext = this.hxS.getContext();
        if ((localContext == null) || (!(localContext instanceof MMActivity)))
        {
          this.hxS.M(this.hwi, this.hwz.j("fail", null));
          aBW();
          AppMethodBeat.o(130535);
        }
        else
        {
          h localh = (h)this.hxS.aa(h.class);
          if ((localh == null) || (bo.isNullOrNil(localh.cwz)))
          {
            this.hxS.M(this.hwi, this.hwz.j("fail", null));
            aBW();
            AppMethodBeat.o(130535);
          }
          else
          {
            Intent localIntent = new Intent();
            localIntent.putExtra("OpenWeRunSettingName", localh.cwz);
            ((MMActivity)localContext).ifE = new MMActivity.a()
            {
              public final void c(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
              {
                AppMethodBeat.i(130529);
                if (paramAnonymousInt1 != (JsApiOpenWeRunSetting.OpenWeRunSetting.this.hashCode() & 0xFFFF))
                {
                  JsApiOpenWeRunSetting.OpenWeRunSetting.this.aBW();
                  AppMethodBeat.o(130529);
                }
                while (true)
                {
                  return;
                  if (paramAnonymousInt2 == -1)
                  {
                    JsApiOpenWeRunSetting.OpenWeRunSetting.d(JsApiOpenWeRunSetting.OpenWeRunSetting.this).M(JsApiOpenWeRunSetting.OpenWeRunSetting.b(JsApiOpenWeRunSetting.OpenWeRunSetting.this), JsApiOpenWeRunSetting.OpenWeRunSetting.c(JsApiOpenWeRunSetting.OpenWeRunSetting.this).j("ok", null));
                    JsApiOpenWeRunSetting.OpenWeRunSetting.this.aBW();
                    AppMethodBeat.o(130529);
                  }
                  else if (paramAnonymousInt2 == 0)
                  {
                    JsApiOpenWeRunSetting.OpenWeRunSetting.d(JsApiOpenWeRunSetting.OpenWeRunSetting.this).M(JsApiOpenWeRunSetting.OpenWeRunSetting.b(JsApiOpenWeRunSetting.OpenWeRunSetting.this), JsApiOpenWeRunSetting.OpenWeRunSetting.c(JsApiOpenWeRunSetting.OpenWeRunSetting.this).j("cancel", null));
                    JsApiOpenWeRunSetting.OpenWeRunSetting.this.aBW();
                    AppMethodBeat.o(130529);
                  }
                  else
                  {
                    JsApiOpenWeRunSetting.OpenWeRunSetting.d(JsApiOpenWeRunSetting.OpenWeRunSetting.this).M(JsApiOpenWeRunSetting.OpenWeRunSetting.b(JsApiOpenWeRunSetting.OpenWeRunSetting.this), JsApiOpenWeRunSetting.OpenWeRunSetting.c(JsApiOpenWeRunSetting.OpenWeRunSetting.this).j("fail", null));
                    JsApiOpenWeRunSetting.OpenWeRunSetting.this.aBW();
                    AppMethodBeat.o(130529);
                  }
                }
              }
            };
            d.a(localContext, "appbrand", ".ui.AppBrandOpenWeRunSettingUI", localIntent, hashCode() & 0xFFFF, false);
            aBW();
            AppMethodBeat.o(130535);
          }
        }
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(130536);
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.hys = bool2;
      if (paramParcel.readByte() == 0)
        break label60;
      bool2 = true;
      label30: this.cPT = bool2;
      if (paramParcel.readByte() == 0)
        break label65;
    }
    label60: label65: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hyt = bool2;
      AppMethodBeat.o(130536);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label30;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(130537);
    int i;
    if (this.hys)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      if (!this.cPT)
        break label73;
      i = 1;
      b = i;
      label37: paramParcel.writeByte(b);
      if (!this.hyt)
        break label81;
    }
    label73: label81: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      AppMethodBeat.o(130537);
      return;
      i = 0;
      j = i;
      break;
      i = 0;
      j = i;
      break label37;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting.OpenWeRunSetting
 * JD-Core Version:    0.6.2
 */