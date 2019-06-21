package com.tencent.mm.plugin.qqmail.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.view.KeyEvent;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.i;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.plugin.qqmail.b.v.a;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.a;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.WebView;
import com.tencent.xweb.s;
import java.io.File;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressLint({"SetJavaScriptEnabled"})
public class ComposeUI extends MMActivity
{
  private static List<com.tencent.mm.plugin.qqmail.b.o> pwd;
  private com.tencent.mm.ui.base.p gBk;
  private int mode;
  private int ptH;
  private com.tencent.mm.plugin.qqmail.b.ab puY;
  private long pvG;
  private Map<String, String> pvf;
  private com.tencent.mm.ui.base.o pwA;
  public boolean pwB;
  public boolean pwC;
  public boolean pwD;
  private String pwE;
  private String pwF;
  private String pwG;
  private String pwH;
  private String pwI;
  private String pwJ;
  private String pwK;
  private String pwL;
  private String pwM;
  private boolean pwN;
  private boolean pwO;
  private ap pwP;
  private ap pwQ;
  p.a pwR;
  private View.OnClickListener pwS;
  private View.OnClickListener pwT;
  private MenuItem.OnMenuItemClickListener pwU;
  private View.OnClickListener pwV;
  private View.OnClickListener pwW;
  private v.a pwX;
  private ScrollView pwe;
  protected MailAddrsViewControl pwf;
  private ImageView pwg;
  private LinearLayout pwh;
  private LinearLayout pwi;
  private MailAddrsViewControl pwj;
  private ImageView pwk;
  private LinearLayout pwl;
  private MailAddrsViewControl pwm;
  private ImageView pwn;
  private EditText pwo;
  private LinearLayout pwp;
  private TextView pwq;
  private ImageView pwr;
  private LinearLayout pws;
  private TextView pwt;
  private EditText pwu;
  private MMWebView pwv;
  private com.tencent.mm.plugin.qqmail.b.p pww;
  private b pwx;
  public c pwy;
  private String pwz;

  public ComposeUI()
  {
    AppMethodBeat.i(68213);
    this.pwy = new c(this);
    this.ptH = 1;
    this.pwB = true;
    this.pwC = true;
    this.pwD = false;
    this.pwE = ("(function() { \nvar imgList = document.getElementsByTagName('img');var result = ''; \nfor (var i = 0; i < imgList.length; i++) {var img = imgList[i];var info = img.id + '@@' + img.src;result += info + '&&'}return result;" + "})()".trim());
    this.pwF = "document.getElementById('history').innerHTML";
    this.pwG = "<div id=\"htmlContent\" contenteditable=\"true\" >";
    this.pwH = "</div>";
    this.pwI = null;
    this.mode = 5;
    this.pvf = new HashMap();
    this.puY = ac.ccD();
    this.pwJ = null;
    this.pwK = "weixin://get_img_info/";
    this.pwL = "weixin://get_mail_content/";
    this.pwM = "weixin://img_onclick/";
    this.pwN = false;
    this.pwO = false;
    this.pwP = new ap(new ComposeUI.1(this), true);
    this.pwQ = new ap(new ComposeUI.12(this), true);
    this.pwR = new ComposeUI.17(this);
    this.pwS = new ComposeUI.7(this);
    this.pwT = new ComposeUI.8(this);
    this.pwU = new ComposeUI.10(this);
    this.pwV = new ComposeUI.11(this);
    this.pwW = new ComposeUI.13(this);
    this.pwX = new ComposeUI.15(this);
    AppMethodBeat.o(68213);
  }

  private void Vo(String paramString)
  {
    AppMethodBeat.i(68229);
    File localFile = new File(paramString);
    if (!localFile.exists())
      AppMethodBeat.o(68229);
    while (true)
    {
      return;
      if (this.pwx.wi(paramString))
      {
        com.tencent.mm.ui.base.h.g(this.mController.ylL, 2131302004, 2131297061);
        AppMethodBeat.o(68229);
      }
      else
      {
        int i = (int)localFile.length();
        if (i > 20971520)
        {
          com.tencent.mm.ui.base.h.a(this, 2131302005, 2131297061, null);
          AppMethodBeat.o(68229);
        }
        else
        {
          com.tencent.mm.ui.base.h.a(this, getString(2131302007, new Object[] { bo.ga(i) }), getString(2131297061), new ComposeUI.16(this, i, localFile, paramString), null);
          AppMethodBeat.o(68229);
        }
      }
    }
  }

  private static void a(MailAddrsViewControl paramMailAddrsViewControl)
  {
    AppMethodBeat.i(68227);
    if (pwd == null)
      AppMethodBeat.o(68227);
    while (true)
    {
      return;
      paramMailAddrsViewControl.setMailAdds(pwd);
      AppMethodBeat.o(68227);
    }
  }

  private void bCz()
  {
    AppMethodBeat.i(68222);
    if (!n.c(this, com.tencent.mm.compatible.util.e.euR, "microMsg." + System.currentTimeMillis() + ".jpg", 3))
      Toast.makeText(this, getString(2131302908), 1).show();
    AppMethodBeat.o(68222);
  }

  static void cH(List<com.tencent.mm.plugin.qqmail.b.o> paramList)
  {
    pwd = paramList;
  }

  private void ccQ()
  {
    AppMethodBeat.i(68218);
    this.pwf.clearFocus();
    this.pwj.clearFocus();
    this.pwm.clearFocus();
    AppMethodBeat.o(68218);
  }

  private void ccR()
  {
    AppMethodBeat.i(68220);
    if (this.pwv != null)
    {
      this.pwv.clearFocus();
      this.pwv.getSettings().setJavaScriptEnabled(true);
      this.pwv.setWebViewClient(new b((byte)0));
      this.pwv.setWebChromeClient(new ComposeUI.a(this, (byte)0));
      this.pwv.setOnTouchListener(new ComposeUI.6(this));
    }
    AppMethodBeat.o(68220);
  }

  private String ccS()
  {
    AppMethodBeat.i(68224);
    String str;
    if (this.mode == 6)
    {
      u.a(this.pwv, this.pwL, this.pwF);
      if (this.pwJ == null)
        break label147;
      int i = this.pwJ.indexOf(this.pwG);
      int j = this.pwJ.lastIndexOf(this.pwH);
      if ((i != -1) && (j != -1))
      {
        str = this.pwJ.substring(i + this.pwG.length(), j + this.pwH.length());
        AppMethodBeat.o(68224);
      }
    }
    while (true)
    {
      return str;
      str = this.pwJ;
      AppMethodBeat.o(68224);
      continue;
      if (this.mode == 5)
      {
        str = this.pwu.getText().toString();
        AppMethodBeat.o(68224);
      }
      else
      {
        label147: str = null;
        AppMethodBeat.o(68224);
      }
    }
  }

  private String getSubject()
  {
    int i = 40;
    AppMethodBeat.i(68225);
    String str = this.pwo.getText().toString();
    if (str.trim().length() > 0)
      AppMethodBeat.o(68225);
    while (true)
    {
      return str;
      str = ccS();
      if (this.mode == 5)
      {
        if (str.length() > 0)
        {
          if (str.length() > 40);
          while (true)
          {
            str = str.substring(0, i);
            AppMethodBeat.o(68225);
            break;
            i = str.length();
          }
        }
      }
      else if ((this.mode == 6) && (!bo.isNullOrNil(str)))
      {
        if (str.length() > 40);
        while (true)
        {
          str = str.substring(0, i);
          AppMethodBeat.o(68225);
          break;
          i = str.length();
        }
      }
      str = getString(2131301984);
      AppMethodBeat.o(68225);
    }
  }

  protected final boolean ccT()
  {
    boolean bool = false;
    AppMethodBeat.i(68226);
    if (!this.pwf.cdi())
    {
      Toast.makeText(this, 2131301990, 1).show();
      AppMethodBeat.o(68226);
    }
    while (true)
    {
      return bool;
      if (!this.pwj.cdi())
      {
        Toast.makeText(this, 2131301981, 1).show();
        AppMethodBeat.o(68226);
      }
      else if (!this.pwm.cdi())
      {
        Toast.makeText(this, 2131301979, 1).show();
        AppMethodBeat.o(68226);
      }
      else if (this.pwf.getMailAddrs().size() + this.pwj.getMailAddrs().size() + this.pwm.getMailAddrs().size() > 20)
      {
        Toast.makeText(this, 2131301996, 1).show();
        AppMethodBeat.o(68226);
      }
      else
      {
        AppMethodBeat.o(68226);
        bool = true;
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970426;
  }

  public final void initView()
  {
    AppMethodBeat.i(68219);
    this.pwe = ((ScrollView)findViewById(2131826704));
    this.pwf = ((MailAddrsViewControl)findViewById(2131826708));
    this.pwg = ((ImageView)findViewById(2131826709));
    this.pwh = ((LinearLayout)findViewById(2131826710));
    this.pwi = ((LinearLayout)findViewById(2131826711));
    this.pwj = ((MailAddrsViewControl)findViewById(2131826712));
    this.pwk = ((ImageView)findViewById(2131826713));
    this.pwl = ((LinearLayout)findViewById(2131826714));
    this.pwm = ((MailAddrsViewControl)findViewById(2131826715));
    this.pwn = ((ImageView)findViewById(2131826716));
    this.pwo = ((EditText)findViewById(2131826718));
    this.pwp = ((LinearLayout)findViewById(2131826720));
    this.pwt = ((TextView)findViewById(2131826724));
    this.pwu = ((EditText)findViewById(2131826725));
    this.pwv = MMWebView.a.n(this, 2131826726);
    this.pwq = ((TextView)findViewById(2131826721));
    this.pwr = ((ImageView)findViewById(2131826722));
    this.pws = ((LinearLayout)findViewById(2131826723));
    this.pwf.setEditable(true);
    this.pwj.setEditable(true);
    this.pwm.setEditable(true);
    Object localObject1 = getIntent().getStringExtra("mail_content");
    Object localObject2 = getIntent().getStringArrayListExtra("mail_attach");
    Object localObject3 = getIntent().getStringArrayListExtra("mail_attach_title");
    Object localObject4 = ac.ccC().puE.cQ(this.pwz, this.ptH);
    this.pwx = new b(this, this.pwq, this.pwr, this.pws, (byte)0);
    int i;
    if (!bo.isNullOrNil((String)localObject1))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ComposeUI", "read mail from extra");
      if (this.mode == 6)
      {
        ccR();
        this.pwf.requestFocus();
        this.pwJ = String.format(this.pwI, new Object[] { localObject1 });
        this.pwv.loadDataWithBaseURL("", this.pwJ, "text/html", "utf-8", "");
        this.pwu.setVisibility(8);
        this.pwv.setVisibility(0);
        this.pwx.mode = this.mode;
        if (this.mode == 6)
        {
          localObject4 = ((List)localObject2).iterator();
          i = 0;
          label483: 
          while (((Iterator)localObject4).hasNext())
          {
            localObject2 = (String)((Iterator)localObject4).next();
            localObject1 = new File((String)localObject2);
            if (((File)localObject1).exists())
            {
              if ((int)((File)localObject1).length() + this.pwx.cde() <= 52428800)
                break label1213;
              com.tencent.mm.ui.base.h.a(this, 2131302006, 2131297061, null);
            }
          }
        }
        if (this.ptH == 1)
          break label1575;
        localObject1 = getIntent().getStringArrayExtra("toList");
        localObject3 = getIntent().getStringArrayExtra("ccList");
        localObject2 = getIntent().getStringArrayExtra("bccList");
        localObject4 = getIntent().getStringExtra("subject");
        this.pwf.b((String[])localObject1, false);
        this.pwj.b((String[])localObject3, false);
        this.pwm.b((String[])localObject2, false);
        if (!bo.isNullOrNil((String)localObject4))
        {
          localObject2 = this.pwo;
          localObject1 = new StringBuilder();
          if (this.ptH != 2)
            break label1568;
          localObject3 = "Re:";
          label664: ((EditText)localObject2).setText((String)localObject3 + (String)localObject4);
        }
        label681: if ((this.pwj.getMailAddrs().size() > 0) || (this.pwm.getMailAddrs().size() > 0))
        {
          this.pwh.setVisibility(8);
          this.pwi.setVisibility(0);
          this.pwl.setVisibility(0);
        }
        if ((this.ptH == 2) && (this.mode != 6) && (this.mode == 5))
        {
          this.pwu.requestFocus();
          this.pwu.setSelection(0);
          this.pwe.postDelayed(new ComposeUI.18(this), 1000L);
        }
        this.pwf.setOnActionListener(new ComposeUI.c(this, this.pwg, 0));
        this.pwj.setOnActionListener(new ComposeUI.c(this, this.pwk, 1));
        this.pwm.setOnActionListener(new ComposeUI.c(this, this.pwn, 2));
        localObject3 = new ComposeUI.19(this);
        this.pwf.setInvalidMailAddrListener((MailAddrsViewControl.a)localObject3);
        this.pwj.setInvalidMailAddrListener((MailAddrsViewControl.a)localObject3);
        this.pwm.setInvalidMailAddrListener((MailAddrsViewControl.a)localObject3);
        this.pwg.setOnClickListener(new ComposeUI.20(this));
        this.pwk.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(68204);
            paramAnonymousView = new Intent(ComposeUI.this, MailAddrListUI.class);
            paramAnonymousView.putExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA", ComposeUI.e(ComposeUI.this).a(false, null));
            paramAnonymousView.putExtra("MMActivity.OverrideExitAnimation", 2131034227);
            paramAnonymousView.putExtra("MMActivity.OverrideEnterAnimation", 2131034180);
            ComposeUI.this.startActivityForResult(paramAnonymousView, 1);
            ComposeUI.this.overridePendingTransition(2131034229, 2131034181);
            AppMethodBeat.o(68204);
          }
        });
        this.pwn.setOnClickListener(new ComposeUI.22(this));
        this.pwh.setOnClickListener(this.pwS);
        localObject3 = (ImageView)findViewById(2131826719);
        if ((this.pwC) && (this.pwo.getText().length() > 0))
          ((ImageView)localObject3).setVisibility(0);
        this.pwo.setOnFocusChangeListener(new ComposeUI.23(this));
        this.pwo.addTextChangedListener(new ComposeUI.2(this, (ImageView)localObject3));
        ((ImageView)localObject3).setOnClickListener(new ComposeUI.3(this));
        this.pwp.setOnClickListener(this.pwT);
        setMMTitle(2131301988);
        if (getIntent().getBooleanExtra("show_qqmail", false))
        {
          i = ((Integer)g.RP().Ry().get(9, Integer.valueOf(0))).intValue();
          if (i != 0)
            break label1679;
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ComposeUI", "want to show qqmail address, but unbind qq");
        }
        label1091: setBackBtn(this.pwU);
        if (this.mode != 5)
          break label1714;
        addTextOptionMenu(0, getString(2131297041), new ComposeUI.4(this));
      }
    }
    while (true)
    {
      enableOptionMenu(false);
      ccQ();
      AppMethodBeat.o(68219);
      return;
      if (this.mode != 5)
        break;
      this.pwu.setVisibility(0);
      this.pwv.setVisibility(8);
      if (((String)localObject1).indexOf("<div>") != -1)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ComposeUI", "set content in html format");
        this.pwu.setText(Html.fromHtml((String)localObject1));
        break;
      }
      this.pwu.setText((CharSequence)localObject1);
      break;
      label1213: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ComposeUI", "in upload file mode = %d", new Object[] { Integer.valueOf(this.mode) });
      this.pwx.fG((String)localObject2, (String)((List)localObject3).get(i));
      i++;
      break label483;
      if ((localObject4 != null) && (this.mode == 6))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ComposeUI", "read mail from draftMail");
        this.pwf.cJ(((com.tencent.mm.plugin.qqmail.b.j)localObject4).ptJ);
        this.pwj.cJ(((com.tencent.mm.plugin.qqmail.b.j)localObject4).ptK);
        this.pwm.cJ(((com.tencent.mm.plugin.qqmail.b.j)localObject4).ptL);
        this.pwo.setText(((com.tencent.mm.plugin.qqmail.b.j)localObject4).ptN);
        localObject3 = ((com.tencent.mm.plugin.qqmail.b.j)localObject4).content;
        this.mode = 5;
        if (((String)localObject3).indexOf("<div>") != -1)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ComposeUI", "set content in html format");
          this.pwu.setText(Html.fromHtml((String)localObject3));
        }
        while (true)
        {
          this.pwx.mode = this.mode;
          this.pwx.cI(((com.tencent.mm.plugin.qqmail.b.j)localObject4).ptM);
          this.pwx.cdd();
          this.pwv.setVisibility(8);
          this.pwu.setVisibility(0);
          break;
          this.pwu.setText((CharSequence)localObject3);
        }
      }
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ComposeUI", "no extra or draf mail content");
      if (this.mode == 6)
      {
        ccR();
        this.pwf.requestFocus();
        this.pwJ = String.format(this.pwI, new Object[] { "" });
        this.pwv.loadDataWithBaseURL("", this.pwJ, "text/html", "utf-8", "");
        this.pwu.setVisibility(8);
        this.pwv.setVisibility(0);
      }
      while (true)
      {
        this.pwx.mode = this.mode;
        break;
        if (this.mode == 5)
        {
          this.pwv.setVisibility(8);
          this.pwu.setVisibility(0);
        }
      }
      label1568: localObject3 = "Fwd:";
      break label664;
      label1575: if ((this.ptH == 2) || (this.ptH == 3))
      {
        this.pwt.setVisibility(0);
        break label681;
      }
      if (this.ptH == 4)
      {
        localObject3 = getIntent().getStringArrayExtra("toList");
        if ((localObject3 == null) || (localObject3.length <= 0))
          break label681;
        this.pwf.b((String[])localObject3, false);
        break label681;
      }
      if (this.ptH != 1)
        break label681;
      localObject3 = getIntent().getStringExtra("subject");
      if (bo.isNullOrNil((String)localObject3))
        break label681;
      this.pwo.setText((CharSequence)localObject3);
      break label681;
      label1679: setMMSubTitle(new com.tencent.mm.a.p(i) + "@qq.com");
      break label1091;
      label1714: if (this.mode == 6)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ComposeUI", "set onShareModeSendListener");
        addTextOptionMenu(0, getString(2131297041), new ComposeUI.5(this));
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(68228);
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(68228);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(68228);
      break;
      a(this.pwf);
      showVKB();
      AppMethodBeat.o(68228);
      break;
      a(this.pwj);
      showVKB();
      AppMethodBeat.o(68228);
      break;
      a(this.pwm);
      showVKB();
      AppMethodBeat.o(68228);
      break;
      paramIntent = n.h(this, paramIntent, com.tencent.mm.plugin.i.c.XW());
      if (paramIntent != null)
      {
        Vo(paramIntent);
        ccQ();
        AppMethodBeat.o(68228);
        break;
        if (paramIntent != null)
        {
          paramIntent = a.i(this, paramIntent, com.tencent.mm.plugin.i.c.XW());
          if ((paramIntent != null) && (paramIntent.length() > 0))
          {
            Vo(paramIntent);
            ccQ();
            AppMethodBeat.o(68228);
            break;
            if (paramIntent != null)
            {
              Vo(paramIntent.getStringExtra("choosed_file_path"));
              ccQ();
            }
          }
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(68214);
    super.onCreate(paramBundle);
    this.pwI = (this.pwG + "%s" + this.pwH);
    this.pwN = false;
    this.pwO = false;
    this.ptH = getIntent().getIntExtra("composeType", 1);
    this.pwz = getIntent().getStringExtra("mailid");
    if (this.pwz == null)
      this.pwz = "";
    this.mode = getIntent().getIntExtra("mail_mode", 5);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ComposeUI", "onCreate, mode = %d", new Object[] { Integer.valueOf(this.mode) });
    initView();
    this.pww = ac.ccC().puD;
    this.pww.a(this.pwR);
    this.pww.ccq();
    this.pwQ.ae(180000L, 180000L);
    AppMethodBeat.o(68214);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(68217);
    super.onDestroy();
    if (pwd != null)
      pwd = null;
    this.pwx.cdb();
    b localb = this.pwx;
    g.RO().eJo.b(484, localb);
    this.pww.b(this.pwR);
    this.pwy.release();
    this.pwQ.stopTimer();
    AppMethodBeat.o(68217);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(68221);
    boolean bool;
    if (paramInt == 4)
    {
      this.pwU.onMenuItemClick(null);
      bool = true;
      AppMethodBeat.o(68221);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(68221);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(68216);
    super.onPause();
    aqX();
    this.pwP.stopTimer();
    if (this.pwA != null)
      this.pwA.dismiss();
    AppMethodBeat.o(68216);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(68223);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ComposeUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(68223);
      return;
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ComposeUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 16:
    }
    while (true)
    {
      AppMethodBeat.o(68223);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        bCz();
        AppMethodBeat.o(68223);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301920), getString(2131301936), getString(2131300878), getString(2131296868), false, new ComposeUI.9(this), null);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(68215);
    super.onResume();
    this.pwP.ae(1500L, 1500L);
    AppMethodBeat.o(68215);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public void setRequestedOrientation(int paramInt)
  {
  }

  final class b extends s
  {
    private boolean pxk = false;

    private b()
    {
    }

    public final boolean a(WebView paramWebView, String paramString)
    {
      AppMethodBeat.i(68208);
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ComposeUI", "shouldOverrideUrlLoading, url = %s", new Object[] { paramString });
      if (paramString.startsWith(ComposeUI.m(ComposeUI.this)))
        ComposeUI.this.aqX();
      while (true)
      {
        Object localObject;
        try
        {
          paramString = URLDecoder.decode(paramString.substring(ComposeUI.m(ComposeUI.this).length()), "utf-8").split("@@");
          localObject = paramString[0].split(":");
          paramWebView = localObject[0];
          localObject = localObject[1];
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ComposeUI", "img onclick, src: %s, msgLocalId: %s, msgSvrId: %s", new Object[] { paramString[1], paramWebView, localObject });
          paramString = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(Integer.valueOf(paramWebView).intValue());
          paramWebView = new android/content/Intent;
          paramWebView.<init>(ComposeUI.this, MailImageDownloadUI.class);
          paramWebView.putExtra("img_msg_id", paramString.field_msgId);
          paramWebView.putExtra("img_server_id", paramString.field_msgSvrId);
          paramWebView.putExtra("img_download_compress_type", 0);
          paramWebView.putExtra("img_download_username", paramString.field_talker);
          ComposeUI.this.startActivity(paramWebView);
          AppMethodBeat.o(68208);
          return true;
        }
        catch (Exception paramWebView)
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ComposeUI", "shouldOverrideUrlLoading IMG_ONCLICK, ex = %s", new Object[] { paramWebView.getMessage() });
        }
        label380: 
        do
        {
          while (true)
          {
            AppMethodBeat.o(68208);
            break;
            if (!paramString.startsWith(ComposeUI.n(ComposeUI.this)))
              break label380;
            try
            {
              ComposeUI.a(ComposeUI.this, URLDecoder.decode(paramString.substring(ComposeUI.n(ComposeUI.this).length()), "utf-8"));
              if (ComposeUI.o(ComposeUI.this))
                if (ComposeUI.p(ComposeUI.this).indexOf("<img") == -1)
                {
                  ComposeUI.q(ComposeUI.this).clear();
                  ComposeUI.r(ComposeUI.this);
                  AppMethodBeat.o(68208);
                }
            }
            catch (Exception paramWebView)
            {
              while (true)
                com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ComposeUI", "shouldOverrideUrlLoading GET_MAIL_CONTENT, ex = %s", new Object[] { paramWebView.getMessage() });
              u.a(ComposeUI.s(ComposeUI.this), ComposeUI.t(ComposeUI.this), ComposeUI.u(ComposeUI.this));
              AppMethodBeat.o(68208);
            }
          }
          break;
        }
        while (!paramString.startsWith(ComposeUI.t(ComposeUI.this)));
        ComposeUI.q(ComposeUI.this).clear();
        try
        {
          paramWebView = URLDecoder.decode(paramString.substring(ComposeUI.t(ComposeUI.this).length()), "utf-8");
          String[] arrayOfString = paramWebView.split("&&");
          for (int i = 0; i < arrayOfString.length; i++)
          {
            paramWebView = arrayOfString[i].split("@@");
            localObject = paramWebView[0].split(":")[1];
            paramString = paramWebView[1];
            paramWebView = paramString;
            if (paramString.startsWith("file://"))
              paramWebView = paramString.replaceFirst("file://", "");
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ComposeUI", "put msgImgInfoMap, msgSvrId: %s, path: %s", new Object[] { localObject, paramWebView });
            ComposeUI.q(ComposeUI.this).put(localObject, paramWebView);
          }
        }
        catch (Exception paramWebView)
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ComposeUI", "shouldOverrideUrlLoading GET_IMG_INFO, ex = %s", new Object[] { paramWebView.getMessage() });
          AppMethodBeat.o(68208);
        }
        continue;
        if (ComposeUI.o(ComposeUI.this))
          ComposeUI.r(ComposeUI.this);
        AppMethodBeat.o(68208);
      }
    }

    public final void b(WebView paramWebView, String paramString)
    {
      AppMethodBeat.i(68210);
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ComposeUI", "onPageFinished, url = %s, firstTimeLoaded = %b", new Object[] { paramString, Boolean.valueOf(this.pxk) });
      if (!this.pxk)
      {
        this.pxk = true;
        u.a(ComposeUI.s(ComposeUI.this), ComposeUI.n(ComposeUI.this), ComposeUI.x(ComposeUI.this));
      }
      super.b(paramWebView, paramString);
      AppMethodBeat.o(68210);
    }

    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      AppMethodBeat.i(68209);
      super.b(paramWebView, paramString, paramBitmap);
      if (!ComposeUI.v(ComposeUI.this))
      {
        u.d(ComposeUI.s(ComposeUI.this));
        ComposeUI.w(ComposeUI.this);
      }
      AppMethodBeat.o(68209);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI
 * JD-Core Version:    0.6.2
 */