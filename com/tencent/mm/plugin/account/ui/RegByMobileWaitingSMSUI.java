package com.tencent.mm.plugin.account.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegByMobileWaitingSMSUI extends MMActivity
{
  private String cFl;
  private boolean gFY;
  private int gFg;
  private TextView gGU;
  private CountDownTimer gGV;
  private ListView gGW;
  private RegByMobileWaitingSMSUI.a gGX;
  private List<Integer> gGY;
  String[] gGZ;
  private Drawable gHa;
  private List<Drawable> gHb;
  private boolean gHc;
  private String gsF;
  private ProgressBar progressBar;

  public RegByMobileWaitingSMSUI()
  {
    AppMethodBeat.i(125485);
    this.gFg = 30;
    this.gGY = new ArrayList();
    this.gGZ = new String[] { "你好", "可以请你喝一杯吗？", "Здравствуйте!", "Darf ich Ihnen einen Drink ausgeben?", "Ich habe Gefühle für Dich.", "Bonjour!", "Prends soins de toi.", "?Hola! ", "Soy un ingeniero.", "Tu novio es un hombre bonito", "今日は!", "カッコいいですね", "Buona notte!", "Ayons une fête ce soir!", "Let's enjoy the holidays.", "Hello!" };
    this.gHb = new ArrayList();
    this.gHc = false;
    AppMethodBeat.o(125485);
  }

  @TargetApi(8)
  private void arh()
  {
    // Byte code:
    //   0: ldc 114
    //   2: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 116	com/tencent/mm/plugin/account/ui/RegByMobileWaitingSMSUI:gGV	Landroid/os/CountDownTimer;
    //   9: ifnonnull +43 -> 52
    //   12: aload_0
    //   13: new 6	com/tencent/mm/plugin/account/ui/RegByMobileWaitingSMSUI$2
    //   16: dup
    //   17: aload_0
    //   18: aload_0
    //   19: getfield 54	com/tencent/mm/plugin/account/ui/RegByMobileWaitingSMSUI:gFg	I
    //   22: sipush 1000
    //   25: imul
    //   26: i2l
    //   27: invokespecial 119	com/tencent/mm/plugin/account/ui/RegByMobileWaitingSMSUI$2:<init>	(Lcom/tencent/mm/plugin/account/ui/RegByMobileWaitingSMSUI;J)V
    //   30: putfield 116	com/tencent/mm/plugin/account/ui/RegByMobileWaitingSMSUI:gGV	Landroid/os/CountDownTimer;
    //   33: aload_0
    //   34: getfield 121	com/tencent/mm/plugin/account/ui/RegByMobileWaitingSMSUI:progressBar	Landroid/widget/ProgressBar;
    //   37: aload_0
    //   38: getfield 54	com/tencent/mm/plugin/account/ui/RegByMobileWaitingSMSUI:gFg	I
    //   41: invokevirtual 126	android/widget/ProgressBar:setMax	(I)V
    //   44: aload_0
    //   45: getfield 116	com/tencent/mm/plugin/account/ui/RegByMobileWaitingSMSUI:gGV	Landroid/os/CountDownTimer;
    //   48: invokevirtual 132	android/os/CountDownTimer:start	()Landroid/os/CountDownTimer;
    //   51: pop
    //   52: ldc 114
    //   54: invokestatic 102	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   57: return
  }

  private void arq()
  {
    try
    {
      AppMethodBeat.i(125495);
      if ((this.gGV != null) && (this.gGV != null))
      {
        this.gGV.cancel();
        this.gGV = null;
      }
      if (!this.gFY)
      {
        this.gFY = true;
        Intent localIntent = getIntent();
        localIntent.putExtra("mobile_verify_purpose", 2);
        a(MobileVerifyUI.class, localIntent);
        finish();
      }
      AppMethodBeat.o(125495);
      return;
    }
    finally
    {
    }
  }

  private void arw()
  {
    AppMethodBeat.i(125491);
    Object localObject = getString(2131297566);
    if (d.vxr)
      localObject = getString(2131296982) + getString(2131296513);
    setMMTitle((String)localObject);
    this.cFl = getIntent().getExtras().getString("bindmcontact_mobile");
    this.cFl = av.amN(this.cFl);
    this.gFg = getIntent().getIntExtra("mobileverify_countdownsec", this.gFg);
    localObject = new Random();
    for (int i = 0; i < this.gFg; i++)
      this.gGY.add(Integer.valueOf(((Random)localObject).nextInt(1000)));
    i = ((Random)localObject).nextInt(1000) % this.gHb.size();
    this.gHa = ((Drawable)this.gHb.get(i));
    this.gHb.remove(i);
    AppMethodBeat.o(125491);
  }

  private void goBack()
  {
    AppMethodBeat.i(125494);
    h.d(this, getString(2131301473), "", getString(2131301474), getString(2131301475), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(125477);
        RegByMobileWaitingSMSUI.g(RegByMobileWaitingSMSUI.this);
        RegByMobileWaitingSMSUI.this.finish();
        AppMethodBeat.o(125477);
      }
    }
    , new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    });
    AppMethodBeat.o(125494);
  }

  public final int getLayoutId()
  {
    return 2130970240;
  }

  public final void initView()
  {
    AppMethodBeat.i(125490);
    this.gGU = ((TextView)findViewById(2131826135));
    this.progressBar = ((ProgressBar)findViewById(2131826136));
    this.gGW = ((ListView)findViewById(2131826137));
    this.gFY = false;
    arw();
    setBackBtn(new RegByMobileWaitingSMSUI.1(this));
    new av();
    Object localObject = "86";
    if (this.cFl.startsWith("+"))
    {
      this.cFl = this.cFl.replace("+", "");
      str = av.Ps(this.cFl);
      localObject = str;
      if (str != null)
      {
        this.cFl = this.cFl.substring(str.length());
        localObject = str;
      }
    }
    String str = av.formatNumber((String)localObject, this.cFl);
    if ((localObject != null) && (((String)localObject).length() > 0))
      this.gGU.setText("+" + (String)localObject + " " + str);
    while (true)
    {
      this.gGW.setVisibility(4);
      arh();
      AppMethodBeat.o(125490);
      return;
      this.gGU.setText(str);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125486);
    super.onCreate(paramBundle);
    this.gHb.add(getResources().getDrawable(2130839021));
    this.gHb.add(getResources().getDrawable(2130839022));
    this.gHb.add(getResources().getDrawable(2130839023));
    this.gHb.add(getResources().getDrawable(2130839024));
    this.gHb.add(getResources().getDrawable(2130839025));
    this.gHb.add(getResources().getDrawable(2130839026));
    initView();
    this.gsF = com.tencent.mm.plugin.b.a.arO();
    AppMethodBeat.o(125486);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125487);
    super.onDestroy();
    AppMethodBeat.o(125487);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125493);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(125493);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125493);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(125489);
    super.onPause();
    com.tencent.mm.plugin.b.a.wz("RE200_250");
    if (this.gHc)
      com.tencent.mm.plugin.b.a.wA(this.gsF);
    while (true)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",RE200_250,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("RE200_250") + ",2");
      AppMethodBeat.o(125489);
      return;
      com.tencent.mm.plugin.b.a.wA("RE200_300");
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(125488);
    super.onResume();
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",RE200_250,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("RE200_250") + ",1");
    AppMethodBeat.o(125488);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileWaitingSMSUI
 * JD-Core Version:    0.6.2
 */