package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.widget.InputPanelLinearLayout;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.b;
import java.util.Iterator;
import java.util.List;

public class SnsCommentFooter extends InputPanelLinearLayout
{
  MMActivity crP;
  ChatFooterPanel eAk;
  private ImageButton jZh;
  private int jZk;
  private int jZl;
  private int jZm;
  MMEditText oij;
  private Button oik;
  private boolean oil;
  public boolean oim;
  private boolean oin;
  boolean oio;
  private TextWatcher oip;
  cat qJj;
  private SnsCommentFooter.c rrA;
  private be rrB;
  private ImageView rrq;
  private ImageView rrr;
  private Button rrs;
  int rrt;
  private String rru;
  private boolean rrv;
  public boolean rrw;
  private String rrx;
  private boolean rry;
  private SnsCommentFooter.a rrz;
  int state;

  public SnsCommentFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38890);
    this.qJj = null;
    this.rrt = 0;
    this.state = 0;
    this.oil = false;
    this.jZk = -1;
    this.jZl = -1;
    this.jZm = 0;
    this.rrv = x.gu(getContext());
    this.oim = false;
    this.oin = true;
    this.rrx = "";
    this.rry = false;
    this.oio = true;
    this.oip = new SnsCommentFooter.4(this);
    this.crP = ((MMActivity)paramContext);
    AppMethodBeat.o(38890);
  }

  private void aRd()
  {
    AppMethodBeat.i(38894);
    this.eAk.onResume();
    if ((x.gu(getContext())) && (cth()))
      getInputPanelHelper().aA(new SnsCommentFooter.2(this));
    while (true)
    {
      if (this.rrA != null)
        this.rrA.onShow();
      AppMethodBeat.o(38894);
      return;
      this.eAk.setVisibility(0);
    }
  }

  private void aYX()
  {
    AppMethodBeat.i(38905);
    int i = x.gs(getContext());
    if (this.eAk != null)
    {
      this.eAk.setPortHeightPx(i);
      this.eAk.AG();
      ViewGroup.LayoutParams localLayoutParams = this.eAk.getLayoutParams();
      if (localLayoutParams != null)
        localLayoutParams.height = i;
    }
    AppMethodBeat.o(38905);
  }

  private boolean cth()
  {
    boolean bool = true;
    AppMethodBeat.i(38906);
    int i = ae.fr(getContext());
    ab.i("MicroMsg.SnsCommentFooter", "is show key board %d, %d, %d", new Object[] { Integer.valueOf(this.jZl), Integer.valueOf(this.jZk), Integer.valueOf(i) });
    if ((this.jZl > 0) && (this.jZl < this.jZk - i))
      AppMethodBeat.o(38906);
    while (true)
    {
      return bool;
      AppMethodBeat.o(38906);
      bool = false;
    }
  }

  private void iP(boolean paramBoolean)
  {
    AppMethodBeat.i(38909);
    Animation localAnimation1 = AnimationUtils.loadAnimation(getContext(), 2131034216);
    Animation localAnimation2 = AnimationUtils.loadAnimation(getContext(), 2131034221);
    localAnimation1.setDuration(150L);
    localAnimation2.setDuration(150L);
    if ((this.oik == null) || (this.rrs == null))
      AppMethodBeat.o(38909);
    while (true)
    {
      return;
      if (!paramBoolean)
        break label147;
      if ((this.oik.getVisibility() != 8) && (this.oik.getVisibility() != 4))
        break;
      AppMethodBeat.o(38909);
    }
    this.rrs.startAnimation(localAnimation1);
    this.rrs.setVisibility(0);
    this.oik.startAnimation(localAnimation2);
    this.oik.setVisibility(8);
    while (true)
    {
      this.rrs.getParent().requestLayout();
      AppMethodBeat.o(38909);
      break;
      label147: if ((this.oik.getVisibility() == 0) || (this.oik.getVisibility() == 0))
      {
        AppMethodBeat.o(38909);
        break;
      }
      this.oik.startAnimation(localAnimation1);
      this.oik.setVisibility(0);
      this.rrs.startAnimation(localAnimation2);
      this.rrs.setVisibility(8);
    }
  }

  public final void DW(int paramInt)
  {
    this.rrt &= (paramInt ^ 0xFFFFFFFF);
  }

  public final void bMO()
  {
    AppMethodBeat.i(38908);
    this.rrB = null;
    if (this.eAk != null)
    {
      ab.i("MicroMsg.SnsCommentFooter", "commentfooter release");
      this.eAk.AC();
      this.eAk.destroy();
    }
    AppMethodBeat.o(38908);
  }

  public final boolean ctd()
  {
    AppMethodBeat.i(38889);
    boolean bool;
    if ((this.oij.getText() == null) || (bo.isNullOrNil(this.oij.getText().toString())))
    {
      bool = true;
      AppMethodBeat.o(38889);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(38889);
    }
  }

  public final boolean cte()
  {
    boolean bool = true;
    if (this.state == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void ctf()
  {
    AppMethodBeat.i(38895);
    if (this.oij == null)
    {
      ab.e("MicroMsg.SnsCommentFooter", "send edittext is null");
      AppMethodBeat.o(38895);
    }
    while (true)
    {
      return;
      this.oij.removeTextChangedListener(this.oip);
      this.oij.addTextChangedListener(this.oip);
      AppMethodBeat.o(38895);
    }
  }

  public final void ctg()
  {
    AppMethodBeat.i(38900);
    this.oij.setText("");
    this.oij.setHint("");
    this.qJj = null;
    this.rrt = 0;
    this.state = 0;
    AppMethodBeat.o(38900);
  }

  public final void g(List<k> paramList, String paramString)
  {
    AppMethodBeat.i(38896);
    this.rrx = paramString;
    k localk;
    if (this.oij != null)
    {
      if (bo.isNullOrNil(paramString))
        break label172;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        localk = (k)localIterator.next();
        if (paramString.equals(localk.key))
          paramList.remove(localk);
      }
    }
    label172: for (paramString = bo.bc(localk.text, ""); ; paramString = "")
    {
      if (!bo.isNullOrNil(paramString))
      {
        this.rrs.setVisibility(0);
        this.oik.setVisibility(8);
        this.oij.setText("");
        this.oij.asB(paramString);
      }
      while (true)
      {
        if (!this.rry)
          this.oij.addTextChangedListener(new SnsCommentFooter.5(this, paramList));
        this.rry = true;
        AppMethodBeat.o(38896);
        return;
        this.oij.setText("");
      }
    }
  }

  public String getCommentAtPrefix()
  {
    return this.rru;
  }

  public int getCommentFlag()
  {
    return this.rrt;
  }

  public cat getCommentInfo()
  {
    AppMethodBeat.i(38901);
    cat localcat;
    if (this.qJj == null)
    {
      localcat = new cat();
      AppMethodBeat.o(38901);
    }
    while (true)
    {
      return localcat;
      localcat = this.qJj;
      AppMethodBeat.o(38901);
    }
  }

  public final void lj(boolean paramBoolean)
  {
    AppMethodBeat.i(38893);
    if (this.eAk == null)
      AppMethodBeat.o(38893);
    while (true)
    {
      return;
      this.rrw = paramBoolean;
      ab.i("MicroMsg.SnsCommentFooter", "showState ".concat(String.valueOf(paramBoolean)));
      if (paramBoolean)
        break;
      this.eAk.setVisibility(8);
      this.jZh.setImageResource(2131231459);
      this.crP.aqX();
      requestLayout();
      AppMethodBeat.o(38893);
    }
    if (this.state == 0)
    {
      this.crP.showVKB();
      this.oij.requestFocus();
      this.eAk.setVisibility(8);
    }
    while (true)
    {
      this.oin = false;
      AppMethodBeat.o(38893);
      break;
      this.crP.aqX();
      this.oij.requestFocus();
      aRd();
    }
  }

  public final void lk(boolean paramBoolean)
  {
    AppMethodBeat.i(38899);
    if (this.rrq != null)
      if (paramBoolean)
      {
        this.rrq.setVisibility(0);
        if ((com.tencent.mm.m.g.Nu().getInt("SnsAdAtFriendRedDot", 0) == 1) && (com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xWx, true)))
        {
          this.rrr.setVisibility(0);
          AppMethodBeat.o(38899);
        }
      }
    while (true)
    {
      return;
      this.rrr.setVisibility(8);
      AppMethodBeat.o(38899);
      continue;
      this.rrq.setVisibility(8);
      this.rrr.setVisibility(8);
      AppMethodBeat.o(38899);
    }
  }

  public final void m(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(38904);
    super.m(paramBoolean, paramInt);
    this.oim = paramBoolean;
    if ((paramBoolean) && (getVisibility() == 0) && (this.rrB != null))
    {
      ab.d("MicroMsg.SnsCommentFooter", "jacks dynamic adjust animation up");
      this.rrB.cuJ();
    }
    if ((this.jZm != paramInt) && (paramInt != 0))
    {
      this.jZm = paramInt;
      com.tencent.mm.compatible.util.j.x(getContext(), paramInt);
      aYX();
    }
    AppMethodBeat.o(38904);
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(38903);
    super.onConfigurationChanged(paramConfiguration);
    if (this.eAk != null)
      aYX();
    AppMethodBeat.o(38903);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(38907);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.jZk < paramInt4);
    for (paramInt1 = paramInt4; ; paramInt1 = this.jZk)
    {
      this.jZk = paramInt1;
      this.jZl = paramInt4;
      AppMethodBeat.o(38907);
      return;
    }
  }

  public void setAfterEditAction(Runnable paramRunnable)
  {
    AppMethodBeat.i(38891);
    paramRunnable = (ViewGroup)inflate(this.crP, 2130970755, this);
    this.rrq = ((ImageView)paramRunnable.findViewById(2131827735));
    this.rrr = ((ImageView)paramRunnable.findViewById(2131827736));
    this.oik = ((Button)paramRunnable.findViewById(2131827738));
    this.rrs = ((Button)paramRunnable.findViewById(2131827739));
    this.oij = ((MMEditText)paramRunnable.findViewById(2131827737));
    iP(false);
    this.rrq.setOnClickListener(new SnsCommentFooter.6(this));
    this.jZh = ((ImageButton)paramRunnable.findViewById(2131825682));
    this.jZh.setOnClickListener(new SnsCommentFooter.7(this));
    this.oij.setHint(this.crP.getString(2131303840));
    this.oij.setOnTouchListener(new SnsCommentFooter.8(this));
    if (com.tencent.mm.pluginsdk.ui.chat.e.vom == null)
    {
      this.eAk = new com.tencent.mm.pluginsdk.ui.chat.d(this.crP);
      AppMethodBeat.o(38891);
    }
    while (true)
    {
      return;
      this.eAk = com.tencent.mm.pluginsdk.ui.chat.e.vom.dF(getContext());
      this.eAk.setEntranceScene(ChatFooterPanel.vhj);
      this.eAk.setVisibility(8);
      this.eAk.setBackgroundResource(2130838168);
      paramRunnable = (LinearLayout)findViewById(2131820987);
      this.jZm = x.gs(getContext());
      paramRunnable.addView(this.eAk, -1, this.jZm);
      this.eAk.AD();
      this.eAk.bf(false);
      this.eAk.setOnTextOperationListener(new SnsCommentFooter.9(this));
      AppMethodBeat.o(38891);
    }
  }

  public void setAnitiomAdjust(be parambe)
  {
    this.rrB = parambe;
  }

  public void setCommentAtPrefix(String paramString)
  {
    this.rru = paramString;
  }

  public void setCommentFlag(int paramInt)
  {
    this.rrt |= paramInt;
  }

  public void setCommentHint(String paramString)
  {
    AppMethodBeat.i(38898);
    if (!bo.isNullOrNil(paramString))
      if (com.tencent.mm.plugin.sns.ui.widget.d.fF(this.rrt, 1))
      {
        this.oij.setHint(com.tencent.mm.pluginsdk.ui.e.j.b(getContext(), this.crP.getString(2131303566) + paramString + this.crP.getString(2131303593, new Object[] { Float.valueOf(this.oij.getTextSize()) }), this.oij.getTextSize()));
        AppMethodBeat.o(38898);
      }
    while (true)
    {
      return;
      this.oij.setHint(com.tencent.mm.pluginsdk.ui.e.j.b(getContext(), paramString, this.oij.getTextSize()));
      AppMethodBeat.o(38898);
      continue;
      this.oij.setHint("");
      AppMethodBeat.o(38898);
    }
  }

  public void setCommentInfo(cat paramcat)
  {
    this.qJj = paramcat;
  }

  public void setModeClick(boolean paramBoolean)
  {
    this.oil = paramBoolean;
  }

  public void setOnCommentSendImp(b paramb)
  {
    AppMethodBeat.i(38902);
    this.rrs.setOnClickListener(new SnsCommentFooter.1(this, paramb));
    AppMethodBeat.o(38902);
  }

  public void setOnEditTouchListener(SnsCommentFooter.a parama)
  {
    this.rrz = parama;
  }

  public void setOnSmileyShowListener(SnsCommentFooter.c paramc)
  {
    this.rrA = paramc;
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(38897);
    if (this.oij != null)
    {
      this.oij.setText("");
      this.oij.asB(paramString);
    }
    AppMethodBeat.o(38897);
  }

  public void setVisibility(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(38892);
    this.state = 0;
    if (paramInt == 0)
      bool = true;
    lj(bool);
    super.setVisibility(paramInt);
    AppMethodBeat.o(38892);
  }

  static abstract interface b
  {
    public abstract void Zr(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentFooter
 * JD-Core Version:    0.6.2
 */