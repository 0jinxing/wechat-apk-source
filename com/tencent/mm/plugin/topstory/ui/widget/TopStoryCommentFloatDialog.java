package com.tencent.mm.plugin.topstory.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.i;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.im;
import com.tencent.mm.plugin.sns.ui.SnsEditText;
import com.tencent.mm.protocal.protobuf.chp;
import com.tencent.mm.protocal.protobuf.chq;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;

public class TopStoryCommentFloatDialog extends RelativeLayout
  implements com.tencent.mm.ai.f, d
{
  MMActivity hwd;
  TextView nDX;
  long rCN;
  TextView sCW;
  SnsEditText sCX;
  com.tencent.mm.plugin.topstory.a.c.f sIa;
  View sIk;
  public e sIl;
  boolean sIm;
  TopStoryCommentFloatDialog.a sIn;
  TextView sIo;
  private View.OnClickListener sIp;
  com.tencent.mm.ui.base.p tipDialog;

  public TopStoryCommentFloatDialog(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(2250);
    this.tipDialog = null;
    this.sIm = false;
    this.rCN = 0L;
    this.sIp = new TopStoryCommentFloatDialog.8(this);
    init();
    AppMethodBeat.o(2250);
  }

  public TopStoryCommentFloatDialog(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(2251);
    this.tipDialog = null;
    this.sIm = false;
    this.rCN = 0L;
    this.sIp = new TopStoryCommentFloatDialog.8(this);
    init();
    AppMethodBeat.o(2251);
  }

  protected static boolean bBL()
  {
    AppMethodBeat.i(2263);
    int i;
    boolean bool;
    if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
    {
      i = com.tencent.mm.kernel.g.Rg().acS();
      if ((i == 4) || (i == 6))
      {
        AppMethodBeat.o(2263);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(2263);
      bool = false;
      continue;
      if (at.isConnected(ah.getContext()));
      for (i = 6; ; i = 0)
      {
        if (i != 6)
          break label94;
        AppMethodBeat.o(2263);
        bool = true;
        break;
      }
      label94: AppMethodBeat.o(2263);
      bool = false;
    }
  }

  private void cFK()
  {
    AppMethodBeat.i(2260);
    int i = this.sCX.getText().toString().length();
    if (i < 180)
    {
      this.nDX.setVisibility(8);
      this.sCW.setVisibility(8);
      AppMethodBeat.o(2260);
      return;
    }
    this.nDX.setVisibility(0);
    this.sCW.setVisibility(0);
    if (i <= 200);
    for (int j = getResources().getColor(2131690587); ; j = getResources().getColor(2131690384))
    {
      this.nDX.setText(String.valueOf(i));
      this.nDX.setTextColor(j);
      AppMethodBeat.o(2260);
      break;
    }
  }

  private void cHt()
  {
    AppMethodBeat.i(2261);
    int i = this.sCX.getText().toString().length();
    int j = this.sCX.getText().toString().trim().length();
    if ((i > 200) || (i <= 0) || (j <= 0))
    {
      this.sIo.setBackgroundResource(2130840486);
      AppMethodBeat.o(2261);
    }
    while (true)
    {
      return;
      this.sIo.setBackgroundResource(2130840485);
      AppMethodBeat.o(2261);
    }
  }

  private void init()
  {
    AppMethodBeat.i(2252);
    inflate(getContext(), 2130970939, this);
    this.sIk = findViewById(2131828259);
    this.sCX = ((SnsEditText)findViewById(2131828264));
    this.nDX = ((TextView)findViewById(2131828263));
    this.sCW = ((TextView)findViewById(2131828262));
    AppMethodBeat.o(2252);
  }

  public final void a(com.tencent.mm.plugin.topstory.a.c.f paramf, TopStoryCommentFloatDialog.a parama, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2254);
    this.sIm = true;
    this.sIa = paramf;
    setVisibility(0);
    this.sCX.requestFocus();
    this.hwd.showVKB();
    this.sIn = parama;
    paramf = paramf.cFv();
    paramf = "action=14&channelId=" + paramInt1 + "&mpScene=0&kykScene=" + paramf.Scene + "&kykSubScene=0&itemType=" + paramInt2 + "&searchId=" + paramf.wDM + "&docId=" + paramf.wUo + "&byPass=" + paramf.xgw;
    com.tencent.mm.plugin.report.service.h.pYm.e(17080, new Object[] { Integer.valueOf(7), Integer.valueOf(2), paramf });
    AppMethodBeat.o(2254);
  }

  public final void cHs()
  {
    AppMethodBeat.i(2256);
    this.sCX.setText("");
    setVisibility(8);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.sIk.getLayoutParams();
    localLayoutParams.bottomMargin = 0;
    this.sIk.setLayoutParams(localLayoutParams);
    this.hwd.aqX();
    this.sIm = false;
    if (this.sIn != null)
      this.sIn.onDismiss();
    AppMethodBeat.o(2256);
  }

  public final void fU(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2259);
    Object localObject;
    if (paramInt2 == 1)
    {
      localObject = "portrait";
      ab.i("MicroMsg.TopStoryCommentFloatDialog", "onKeyboardHeightChanged in pixels: " + paramInt1 + " " + (String)localObject);
      if (this.sIm)
      {
        this.sIk.setVisibility(0);
        if (((RelativeLayout.LayoutParams)this.sIk.getLayoutParams()).bottomMargin != paramInt1)
        {
          localObject = new TopStoryCommentFloatDialog.5(this, paramInt1);
          if (paramInt1 == 0)
            break label136;
          ((Animation)localObject).setDuration(200L);
        }
      }
    }
    while (true)
    {
      this.sIk.startAnimation((Animation)localObject);
      this.sCX.requestFocus();
      setVisibility(0);
      AppMethodBeat.o(2259);
      return;
      localObject = "landscape";
      break;
      label136: ((Animation)localObject).setDuration(300L);
    }
  }

  public final void hide()
  {
    AppMethodBeat.i(2255);
    if (this.sCX.getText().toString().length() > 0)
    {
      com.tencent.mm.ui.base.h.a(this.hwd, 2131306028, 0, 2131297088, 2131296990, true, new TopStoryCommentFloatDialog.6(this), new TopStoryCommentFloatDialog.7(this), 2131689776);
      AppMethodBeat.o(2255);
    }
    while (true)
    {
      return;
      cHs();
      AppMethodBeat.o(2255);
    }
  }

  public final void k(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(2253);
    this.hwd = paramMMActivity;
    this.sIl = new e(paramMMActivity);
    setOnClickListener(this.sIp);
    findViewById(2131828260).setOnClickListener(new TopStoryCommentFloatDialog.1(this));
    this.sIo = ((TextView)findViewById(2131828261));
    this.sIo.setOnClickListener(new TopStoryCommentFloatDialog.2(this, paramMMActivity));
    cFK();
    cHt();
    this.sCX.addTextChangedListener(new TopStoryCommentFloatDialog.3(this));
    post(new TopStoryCommentFloatDialog.4(this));
    AppMethodBeat.o(2253);
  }

  public final void onPause()
  {
    AppMethodBeat.i(2257);
    this.sIl.sIe = null;
    com.tencent.mm.kernel.g.Rg().b(2906, this);
    AppMethodBeat.o(2257);
  }

  public final void onResume()
  {
    AppMethodBeat.i(2258);
    this.sIl.sIe = this;
    com.tencent.mm.kernel.g.Rg().a(2906, this);
    AppMethodBeat.o(2258);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(2262);
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    com.tencent.mm.plugin.topstory.a.c.f localf;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramInt1 = 1;
      if (paramInt1 == 0)
        break label271;
      cHs();
      if (this.sIn != null)
        this.sIn.cHi();
      if ((paramm instanceof com.tencent.mm.plugin.topstory.a.c.f))
      {
        localf = (com.tencent.mm.plugin.topstory.a.c.f)paramm;
        paramm = new i();
      }
    }
    while (true)
    {
      try
      {
        paramString = (chp)localf.ehh.fsG.fsP;
        if (paramString != null)
        {
          paramString = paramString.ncM;
          paramm.g("content", paramString);
          paramm.g("id", localf.cFu().xgx);
          paramString = (chp)localf.ehh.fsG.fsP;
          if (paramString == null)
            continue;
          paramString = paramString.wUo;
          paramm.g("docId", paramString);
          paramm.g("opType", "REPLY_ARTICLE_BY_ME");
          paramString = new com/tencent/mm/g/a/im;
          paramString.<init>();
          paramString.cDD.cDE = paramm.toString();
          paramString.cDD.cDF = "";
          a.xxA.m(paramString);
          t.makeText(this.hwd, 2131306030, 0).show();
          AppMethodBeat.o(2262);
          return;
          paramInt1 = 0;
          break;
        }
        paramString = "";
        continue;
        paramString = "";
        continue;
      }
      catch (com.tencent.mm.aa.g paramString)
      {
        ab.e("MicroMsg.TopStoryCommentFloatDialog", "notify tl failed");
        continue;
      }
      label271: com.tencent.mm.ui.base.h.b(this.hwd, this.hwd.getString(2131296906), "", true);
      AppMethodBeat.o(2262);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog
 * JD-Core Version:    0.6.2
 */