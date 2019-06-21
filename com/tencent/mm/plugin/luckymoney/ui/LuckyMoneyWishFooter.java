package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.MMEditText.a;
import java.util.ArrayList;
import java.util.List;

public class LuckyMoneyWishFooter extends BasePanelKeybordLayout
{
  private MMActivity crP;
  private ChatFooterPanel eAk;
  private ImageButton jZh;
  private MMEditText oij;
  private Button oik;
  boolean oil;
  public boolean oim;
  private boolean oin;
  boolean oio;
  private TextWatcher oip;
  private LuckyMoneyWishFooter.a oiq;
  private LuckyMoneyWishFooter.c oir;
  private int state;

  public LuckyMoneyWishFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(43055);
    this.state = 0;
    this.oil = false;
    this.oim = false;
    this.oin = true;
    this.oio = true;
    this.oip = new LuckyMoneyWishFooter.3(this);
    this.crP = ((MMActivity)paramContext);
    paramContext = (ViewGroup)inflate(this.crP, 2130970000, this);
    this.oik = ((Button)paramContext.findViewById(2131825672));
    iP(false);
    this.jZh = ((ImageButton)paramContext.findViewById(2131825671));
    this.jZh.setOnClickListener(new LuckyMoneyWishFooter.4(this));
    this.oij = ((MMEditText)paramContext.findViewById(2131825670));
    this.oij.setOnTouchListener(new LuckyMoneyWishFooter.5(this));
    if (e.vom == null)
    {
      this.eAk = new d(this.crP);
      AppMethodBeat.o(43055);
    }
    while (true)
    {
      return;
      this.eAk = e.vom.dF(getContext());
      this.eAk.setEntranceScene(ChatFooterPanel.vhh);
      this.eAk.setVisibility(8);
      this.eAk.setBackgroundResource(2130837979);
      ((LinearLayout)findViewById(2131820987)).addView(this.eAk, -1, 0);
      this.eAk.AD();
      this.eAk.bf(false);
      this.eAk.setOnTextOperationListener(new LuckyMoneyWishFooter.6(this));
      AppMethodBeat.o(43055);
    }
  }

  private void aRd()
  {
    AppMethodBeat.i(43058);
    this.eAk.onResume();
    this.eAk.postDelayed(new LuckyMoneyWishFooter.2(this), 200L);
    ViewGroup.LayoutParams localLayoutParams = this.eAk.getLayoutParams();
    if (((localLayoutParams != null) && (localLayoutParams.height <= 0)) || ((localLayoutParams != null) && (j.gu(getContext())) && (this.oin)))
    {
      localLayoutParams.height = j.gs(getContext());
      this.eAk.setLayoutParams(localLayoutParams);
      this.oin = false;
    }
    AppMethodBeat.o(43058);
  }

  private void bMN()
  {
    AppMethodBeat.i(43057);
    if (this.state == 0)
    {
      this.oij.requestFocus();
      this.crP.getWindow().setSoftInputMode(16);
      this.crP.showVKB();
      this.eAk.postDelayed(new LuckyMoneyWishFooter.1(this), 200L);
      AppMethodBeat.o(43057);
    }
    while (true)
    {
      return;
      this.oij.requestFocus();
      this.crP.getWindow().setSoftInputMode(32);
      this.crP.aqX();
      aRd();
      AppMethodBeat.o(43057);
    }
  }

  private void iP(boolean paramBoolean)
  {
    AppMethodBeat.i(43066);
    Animation localAnimation1 = AnimationUtils.loadAnimation(getContext(), 2131034216);
    Animation localAnimation2 = AnimationUtils.loadAnimation(getContext(), 2131034221);
    localAnimation1.setDuration(150L);
    localAnimation2.setDuration(150L);
    if (this.oik == null)
      AppMethodBeat.o(43066);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        if ((this.oik.getVisibility() == 8) || (this.oik.getVisibility() == 4))
        {
          AppMethodBeat.o(43066);
        }
        else
        {
          this.oik.startAnimation(localAnimation2);
          this.oik.setVisibility(8);
          AppMethodBeat.o(43066);
        }
      }
      else if ((this.oik.getVisibility() == 0) || (this.oik.getVisibility() == 0))
      {
        AppMethodBeat.o(43066);
      }
      else
      {
        this.oik.startAnimation(localAnimation1);
        this.oik.setVisibility(0);
        AppMethodBeat.o(43066);
      }
    }
  }

  public final boolean a(MMEditText.a parama)
  {
    AppMethodBeat.i(43060);
    boolean bool;
    if (this.oij != null)
    {
      this.oij.setBackListener(parama);
      bool = true;
      AppMethodBeat.o(43060);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(43060);
    }
  }

  public final void bMO()
  {
    AppMethodBeat.i(43065);
    if (this.eAk != null)
    {
      ab.i("MicroMsg.SnsCommentFooter", "commentfooter release");
      this.eAk.AC();
      this.eAk.destroy();
    }
    AppMethodBeat.o(43065);
  }

  public List<View> getPanelView()
  {
    AppMethodBeat.i(43067);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.eAk);
    AppMethodBeat.o(43067);
    return localArrayList;
  }

  public final void sD(int paramInt)
  {
    AppMethodBeat.i(43064);
    super.sD(paramInt);
    switch (paramInt)
    {
    default:
      this.oim = false;
      AppMethodBeat.o(43064);
    case -3:
    }
    while (true)
    {
      return;
      this.oim = true;
      AppMethodBeat.o(43064);
    }
  }

  public void setHint(String paramString)
  {
    AppMethodBeat.i(43062);
    this.oij.setHint(paramString);
    AppMethodBeat.o(43062);
  }

  public void setMaxLength(int paramInt)
  {
    AppMethodBeat.i(43059);
    this.oij.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt) });
    AppMethodBeat.o(43059);
  }

  public void setModeClick(boolean paramBoolean)
  {
    this.oil = paramBoolean;
  }

  public void setOnEditTouchListener(LuckyMoneyWishFooter.a parama)
  {
    this.oiq = parama;
  }

  public void setOnSmileyShowListener(LuckyMoneyWishFooter.c paramc)
  {
    this.oir = paramc;
  }

  public void setOnWishSendImp(LuckyMoneyWishFooter.b paramb)
  {
    AppMethodBeat.i(43063);
    this.oik.setOnClickListener(new LuckyMoneyWishFooter.7(this, paramb));
    AppMethodBeat.o(43063);
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(43061);
    if (this.oij != null)
    {
      this.oij.setText("");
      this.oij.asB(paramString);
    }
    AppMethodBeat.o(43061);
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(43056);
    this.state = 0;
    boolean bool;
    if (paramInt == 0)
    {
      bool = true;
      if (this.eAk != null)
      {
        ab.i("MicroMsg.SnsCommentFooter", "showState ".concat(String.valueOf(bool)));
        if (bool)
          break label118;
        ab.d("MicroMsg.SnsCommentFooter", bo.dpG());
        this.eAk.setVisibility(8);
        this.jZh.setImageResource(2131231459);
        this.crP.aqX();
        setModeClick(true);
        requestLayout();
      }
    }
    while (true)
    {
      super.setVisibility(paramInt);
      AppMethodBeat.o(43056);
      return;
      bool = false;
      break;
      label118: bMN();
      this.oin = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter
 * JD-Core Version:    0.6.2
 */