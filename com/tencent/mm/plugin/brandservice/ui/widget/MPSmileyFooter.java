package com.tencent.mm.plugin.brandservice.ui.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.u;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.InputPanelLinearLayout;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.b;

public class MPSmileyFooter extends InputPanelLinearLayout
{
  private MMActivity crP;
  private ChatFooterPanel eAk;
  private MMEditText jZg;
  private ImageButton jZh;
  private LinearLayout jZi;
  private LinearLayout jZj;
  private int jZk;
  private int jZl;
  private int jZm;
  private boolean jZn;

  public MPSmileyFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(14472);
    this.jZg = null;
    this.jZk = -1;
    this.jZl = -1;
    this.jZm = 0;
    this.jZn = true;
    this.crP = ((MMActivity)paramContext);
    this.jZh = ((ImageButton)((ViewGroup)v.hu(this.crP).inflate(2130970251, this)).findViewById(2131825682));
    this.jZh.setOnClickListener(new MPSmileyFooter.3(this));
    if (e.vom == null)
    {
      this.eAk = new d(this.crP);
      AppMethodBeat.o(14472);
    }
    while (true)
    {
      return;
      this.eAk = u.i(this.crP, true);
      this.eAk.setEntranceScene(ChatFooterPanel.vhj);
      this.eAk.setBackgroundResource(2131689979);
      this.eAk.setVisibility(8);
      this.jZi = ((LinearLayout)findViewById(2131826165));
      this.jZj = ((LinearLayout)findViewById(2131826164));
      this.jZi.setOnClickListener(null);
      this.jZm = x.gs(getContext());
      this.jZi.addView(this.eAk, -1, this.jZm);
      this.eAk.AD();
      this.eAk.bf(false);
      aYX();
      this.eAk.setOnTextOperationListener(new MPSmileyFooter.4(this));
      AppMethodBeat.o(14472);
    }
  }

  private void aRe()
  {
    AppMethodBeat.i(14480);
    this.eAk.onPause();
    if (x.gu(getContext()))
    {
      getInputPanelHelper().az(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(14470);
          MPSmileyFooter.d(MPSmileyFooter.this).setVisibility(8);
          AppMethodBeat.o(14470);
        }
      });
      AppMethodBeat.o(14480);
    }
    while (true)
    {
      return;
      this.eAk.setVisibility(8);
      AppMethodBeat.o(14480);
    }
  }

  private void aYX()
  {
    AppMethodBeat.i(14482);
    ViewGroup.LayoutParams localLayoutParams = this.jZi.getLayoutParams();
    localLayoutParams.height = this.jZm;
    this.jZi.setLayoutParams(localLayoutParams);
    int i = x.gs(getContext());
    this.eAk.setPortHeightPx(i);
    this.eAk.AG();
    localLayoutParams = this.eAk.getLayoutParams();
    if (localLayoutParams != null)
      localLayoutParams.height = i;
    AppMethodBeat.o(14482);
  }

  public final void aYS()
  {
    AppMethodBeat.i(14473);
    setVisibility(0);
    if (this.jZh != null)
      this.jZh.setImageResource(2130839611);
    AppMethodBeat.o(14473);
  }

  public final void aYT()
  {
    AppMethodBeat.i(14474);
    if (aYV())
      AppMethodBeat.o(14474);
    while (true)
    {
      return;
      setVisibility(8);
      AppMethodBeat.o(14474);
    }
  }

  public final boolean aYU()
  {
    AppMethodBeat.i(14476);
    boolean bool;
    if ((aYV()) || (getVisibility() == 0))
    {
      bool = true;
      AppMethodBeat.o(14476);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14476);
    }
  }

  public final boolean aYV()
  {
    AppMethodBeat.i(14477);
    boolean bool;
    if (this.eAk.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(14477);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14477);
    }
  }

  public final void aYW()
  {
    AppMethodBeat.i(14478);
    aRe();
    setVisibility(8);
    AppMethodBeat.o(14478);
  }

  public final void m(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(14481);
    super.m(paramBoolean, paramInt);
    if ((this.jZm != paramInt) && (paramInt != 0))
    {
      this.jZm = paramInt;
      j.x(getContext(), paramInt);
      aYX();
    }
    AppMethodBeat.o(14481);
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(14479);
    super.onConfigurationChanged(paramConfiguration);
    if (this.eAk != null)
    {
      aYX();
      this.eAk.refresh();
    }
    AppMethodBeat.o(14479);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(14483);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.jZk < paramInt4);
    for (paramInt1 = paramInt4; ; paramInt1 = this.jZk)
    {
      this.jZk = paramInt1;
      this.jZl = paramInt4;
      AppMethodBeat.o(14483);
      return;
    }
  }

  public void setMMEditText(MMEditText paramMMEditText)
  {
    AppMethodBeat.i(14475);
    this.jZg = paramMMEditText;
    paramMMEditText.setOnClickListener(new MPSmileyFooter.1(this));
    paramMMEditText.setOnEditorActionListener(new MPSmileyFooter.2(this));
    AppMethodBeat.o(14475);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPSmileyFooter
 * JD-Core Version:    0.6.2
 */