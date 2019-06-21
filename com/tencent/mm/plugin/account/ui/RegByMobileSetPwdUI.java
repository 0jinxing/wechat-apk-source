package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ax;
import com.tencent.mm.modelsimple.x;
import com.tencent.mm.plugin.account.a.b.a.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.gf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import java.io.IOException;

public class RegByMobileSetPwdUI extends SetPwdUI
{
  private String cxb = null;
  private TextView gDQ;
  private TextView gGA;
  private View gGB;
  private View gGC;
  private TextView gGD;
  public View gGE;
  public EditText gGF;
  private boolean gGG = false;
  public boolean gGH;
  private int gGI = 0;
  private SKBuiltinBuffer_t gGJ = null;
  private String hint = null;

  private void ars()
  {
    AppMethodBeat.i(125445);
    TextView localTextView1 = (TextView)findViewById(2131826946);
    TextView localTextView2 = (TextView)findViewById(2131826948);
    TextView localTextView3 = (TextView)findViewById(2131826950);
    EditText localEditText1 = (EditText)findViewById(2131826949);
    EditText localEditText2 = (EditText)findViewById(2131826951);
    if (!com.tencent.mm.sdk.platformtools.aa.don())
    {
      localTextView1.setTextSize(1, 14.0F);
      localTextView2.setTextSize(1, 14.0F);
      localTextView3.setTextSize(1, 14.0F);
      localEditText1.setTextSize(1, 14.0F);
      localEditText2.setTextSize(1, 14.0F);
    }
    float f1 = this.gGD.getPaint().measureText(this.gGD.getText().toString());
    float f2 = localTextView1.getPaint().measureText(localTextView1.getText().toString());
    float f3 = localTextView2.getPaint().measureText(localTextView2.getText().toString());
    float f4 = localTextView3.getPaint().measureText(localTextView3.getText().toString());
    f4 = Math.max(Math.max(Math.max(f1, f3), f4), f2);
    localTextView1.setWidth((int)f4);
    this.gGD.setWidth((int)f4);
    localTextView2.setWidth((int)f4);
    localTextView2.setWidth((int)f4);
    AppMethodBeat.o(125445);
  }

  protected final void a(a.a parama)
  {
    AppMethodBeat.i(125450);
    switch (RegByMobileSetPwdUI.3.gzb[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(125450);
      while (true)
      {
        return;
        h.g(this, 2131302285, 2131302287);
        AppMethodBeat.o(125450);
        continue;
        h.g(this, 2131302286, 2131302287);
        AppMethodBeat.o(125450);
        continue;
        h.g(this, 2131304234, 2131302287);
        AppMethodBeat.o(125450);
      }
      h.g(this, 2131304236, 2131302287);
    }
  }

  protected final m ark()
  {
    AppMethodBeat.i(125447);
    if (bo.isNullOrNil(this.cxb))
      this.cxb = ((String)g.RP().Ry().get(77830, null));
    x localx = new x(this.gHW, this.cxb, this.gGI, this.gGJ);
    AppMethodBeat.o(125447);
    return localx;
  }

  protected final String arl()
  {
    AppMethodBeat.i(125446);
    String str = ((EditText)findViewById(2131826949)).getText().toString();
    AppMethodBeat.o(125446);
    return str;
  }

  protected final String arm()
  {
    AppMethodBeat.i(125448);
    String str = ((EditText)findViewById(2131826951)).getText().toString();
    AppMethodBeat.o(125448);
    return str;
  }

  protected final void art()
  {
    AppMethodBeat.i(125449);
    if ((bo.isNullOrNil(this.cxb)) && (this.gGH))
    {
      com.tencent.mm.modelsimple.aa localaa = new com.tencent.mm.modelsimple.aa(this.gGF.getText().toString(), "", "", "");
      g.Rg().a(localaa, 0);
      getString(2131297061);
      this.ehJ = h.b(this, getString(2131297043), false, null);
      AppMethodBeat.o(125449);
    }
    while (true)
    {
      return;
      super.art();
      AppMethodBeat.o(125449);
    }
  }

  public final boolean aru()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130970499;
  }

  public final void initView()
  {
    AppMethodBeat.i(125444);
    if (!this.gHY)
      dyf();
    setMMTitle(2131302302);
    this.gGA = ((TextView)findViewById(2131826877));
    this.gGC = findViewById(2131826943);
    this.gDQ = ((TextView)findViewById(2131826942));
    this.gGD = ((TextView)findViewById(2131826944));
    if ((this.hint != null) && (this.hint.length() > 0))
      this.gDQ.setText(this.hint);
    this.gGE = findViewById(2131826945);
    this.gGF = ((EditText)this.gGE.findViewById(2131826947));
    this.gGB = findViewById(2131826952);
    this.gGB.setOnClickListener(new RegByMobileSetPwdUI.1(this));
    if ((this.gGG) || (!g.RN().QY()))
    {
      this.gGC.setVisibility(8);
      ars();
      AppMethodBeat.o(125444);
      return;
    }
    this.gGC.setVisibility(0);
    String str1 = com.tencent.mm.model.r.YA();
    String str2 = str1;
    if (bo.isNullOrNil(str1))
    {
      str1 = com.tencent.mm.model.r.Yz();
      str2 = str1;
      if (ad.aoA(str1))
        str2 = null;
    }
    if (bo.isNullOrNil(str2))
    {
      str1 = (String)g.RP().Ry().get(6, null);
      str2 = (String)g.RP().Ry().get(5, null);
      if (!bo.isNullOrNil(str1))
        if (bo.ant(str1).booleanValue())
        {
          new av();
          str2 = "86";
          if (!str1.startsWith("+"))
            break label439;
          str1 = str1.replace("+", "");
          str2 = av.Ps(str1);
          if (str2 == null)
            break label436;
          str1 = str1.substring(str2.length());
        }
    }
    label436: label439: 
    while (true)
    {
      str2 = av.formatNumber(str2, str1);
      this.gGD.setText(2131303143);
      this.gGA.setText(str2);
      this.gDQ.setText(2131302304);
      break;
      if (!bo.isNullOrNil(str2))
      {
        this.gGA.setText(str2);
        this.gGD.setText(2131303073);
        this.gDQ.setText(2131302303);
        break;
      }
      this.gGC.setVisibility(8);
      break;
      this.gGD.setText(2131303337);
      this.gGA.setText(str2);
      break;
    }
  }

  protected final boolean k(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(125451);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      finish();
      bool = true;
      AppMethodBeat.o(125451);
    }
    while (true)
    {
      return bool;
      bool = j(paramInt1, paramInt2, paramString);
      AppMethodBeat.o(125451);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(125453);
    if ((paramInt1 == 10001) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringExtra("setpwd_ticket");
      ab.i("MicorMsg.RegByMobileSetPwdUI", "get reset pwd ticket %s", new Object[] { paramIntent });
      if (!bo.isNullOrNil(paramIntent))
      {
        this.cxb = paramIntent;
        this.gGI = 6;
        this.gGE.setVisibility(8);
        this.gGB.setVisibility(8);
      }
    }
    AppMethodBeat.o(125453);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125441);
    super.onCreate(paramBundle);
    this.hint = getIntent().getStringExtra("kintent_hint");
    this.gHY = getIntent().getBooleanExtra("kintent_cancelable", true);
    this.gGG = getIntent().getBooleanExtra("from_unbind", false);
    g.Rg().a(384, this);
    g.Rg().a(255, this);
    initView();
    byte[] arrayOfByte = bo.anf(ax.ZQ().getString("_auth_key", ""));
    paramBundle = new gf();
    if (!bo.cb(arrayOfByte));
    for (this.gGJ = new SKBuiltinBuffer_t().setBuffer(arrayOfByte); ; this.gGJ = new SKBuiltinBuffer_t().setBuffer(new byte[0]))
      try
      {
        paramBundle.parseFrom(arrayOfByte);
        paramBundle = new com.tencent.mm.modelsimple.r(1);
        g.Rg().a(paramBundle, 0);
        getString(2131297061);
        this.ehJ = h.b(this, getString(2131296965), false, null);
        AppMethodBeat.o(125441);
        return;
      }
      catch (IOException paramBundle)
      {
        while (true)
          ab.printErrStackTrace("MicorMsg.RegByMobileSetPwdUI", paramBundle, "summersetpwd Failed parse autoauthkey buf", new Object[0]);
      }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125442);
    super.onDestroy();
    g.Rg().b(384, this);
    g.Rg().b(255, this);
    AppMethodBeat.o(125442);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(125443);
    super.onNewIntent(paramIntent);
    paramIntent = paramIntent.getStringExtra("setpwd_ticket");
    ab.i("MicorMsg.RegByMobileSetPwdUI", "onNewIntent get reset pwd ticket %s", new Object[] { paramIntent });
    if (!bo.isNullOrNil(paramIntent))
    {
      this.cxb = paramIntent;
      this.gGI = 4;
      this.gGE.setVisibility(8);
      this.gGB.setVisibility(8);
    }
    AppMethodBeat.o(125443);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(125452);
    ab.i("MicorMsg.RegByMobileSetPwdUI", "errorCode %d, errorMsg %s, scene %s", new Object[] { Integer.valueOf(paramInt2), paramString, paramm });
    super.onSceneEnd(paramInt1, paramInt2, paramString, paramm);
    if (paramm.getType() == 255)
    {
      if (((com.tencent.mm.modelsimple.r)paramm).fPs != 1)
        break label289;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.gGE.setVisibility(0);
        this.gGB.setVisibility(0);
        this.gGH = true;
        AppMethodBeat.o(125452);
      }
    }
    while (true)
    {
      return;
      if ((paramInt2 == -3) && (paramInt1 == 4))
      {
        this.gGH = false;
        AppMethodBeat.o(125452);
      }
      else
      {
        this.gGE.setVisibility(0);
        this.gGB.setVisibility(0);
        paramString = com.tencent.mm.h.a.jY(paramString);
        if (paramString != null)
        {
          ab.i("MicorMsg.RegByMobileSetPwdUI", "summertips errCode[%d], showType[%d], url[%s], desc[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramString.showType), paramString.url, paramString.desc });
          h.a(this, paramString.desc, paramString.Title, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(125439);
              RegByMobileSetPwdUI.this.finish();
              AppMethodBeat.o(125439);
            }
          });
        }
        AppMethodBeat.o(125452);
        continue;
        if (paramm.getType() == 384)
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            g.RP().Ry().set(77830, ((com.tencent.mm.modelsimple.aa)paramm).agg());
            arJ();
            AppMethodBeat.o(125452);
          }
          else
          {
            h.g(this, 2131302297, 2131297061);
          }
        }
        else
          label289: AppMethodBeat.o(125452);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI
 * JD-Core Version:    0.6.2
 */