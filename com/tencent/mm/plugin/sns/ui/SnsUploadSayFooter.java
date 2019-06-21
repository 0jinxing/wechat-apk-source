package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.InputPanelLinearLayout;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.b;

public class SnsUploadSayFooter extends InputPanelLinearLayout
{
  private MMActivity crP;
  ChatFooterPanel eAk;
  private MMEditText jZg;
  private ImageButton jZh;
  private int jZk;
  private int jZl;
  private int jZm;
  private boolean jZn;

  public SnsUploadSayFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(39723);
    this.jZg = null;
    this.jZk = -1;
    this.jZl = -1;
    this.jZm = 0;
    this.jZn = true;
    this.crP = ((MMActivity)paramContext);
    this.jZh = ((ImageButton)((ViewGroup)v.hu(this.crP).inflate(2130970826, this)).findViewById(2131825682));
    this.jZh.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(39718);
        SnsUploadSayFooter.b(SnsUploadSayFooter.this);
        AppMethodBeat.o(39718);
      }
    });
    if (e.vom == null)
    {
      this.eAk = new d(this.crP);
      AppMethodBeat.o(39723);
    }
    while (true)
    {
      return;
      this.eAk = e.vom.dF(getContext());
      this.eAk.setEntranceScene(ChatFooterPanel.vhj);
      this.eAk.setVisibility(8);
      paramContext = (LinearLayout)findViewById(2131820987);
      paramContext.setOnClickListener(null);
      this.jZm = x.gs(getContext());
      paramContext.addView(this.eAk, -1, this.jZm);
      this.eAk.AD();
      this.eAk.bf(false);
      aYX();
      this.eAk.setOnTextOperationListener(new SnsUploadSayFooter.4(this));
      AppMethodBeat.o(39723);
    }
  }

  private void aRe()
  {
    AppMethodBeat.i(39729);
    this.eAk.onPause();
    if (x.gu(getContext()))
    {
      getInputPanelHelper().az(new SnsUploadSayFooter.5(this));
      AppMethodBeat.o(39729);
    }
    while (true)
    {
      return;
      this.eAk.setVisibility(8);
      AppMethodBeat.o(39729);
    }
  }

  private void aYX()
  {
    AppMethodBeat.i(39731);
    int i = x.gs(getContext());
    this.eAk.setPortHeightPx(i);
    this.eAk.AG();
    ViewGroup.LayoutParams localLayoutParams = this.eAk.getLayoutParams();
    if (localLayoutParams != null)
      localLayoutParams.height = i;
    AppMethodBeat.o(39731);
  }

  public final void aYS()
  {
    AppMethodBeat.i(39724);
    setVisibility(0);
    if (this.jZh != null)
      this.jZh.setImageResource(2130840306);
    AppMethodBeat.o(39724);
  }

  public final boolean aYV()
  {
    AppMethodBeat.i(39726);
    boolean bool;
    if (this.eAk.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(39726);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(39726);
    }
  }

  public final void aYW()
  {
    AppMethodBeat.i(39727);
    aRe();
    setVisibility(8);
    AppMethodBeat.o(39727);
  }

  public final void m(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(39730);
    super.m(paramBoolean, paramInt);
    if ((this.jZm != paramInt) && (paramInt != 0))
    {
      this.jZm = paramInt;
      j.x(getContext(), paramInt);
      aYX();
    }
    AppMethodBeat.o(39730);
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(39728);
    super.onConfigurationChanged(paramConfiguration);
    if (this.eAk != null)
    {
      aYX();
      this.eAk.refresh();
    }
    AppMethodBeat.o(39728);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(39732);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.jZk < paramInt4);
    for (paramInt1 = paramInt4; ; paramInt1 = this.jZk)
    {
      this.jZk = paramInt1;
      this.jZl = paramInt4;
      AppMethodBeat.o(39732);
      return;
    }
  }

  public void setMMEditText(MMEditText paramMMEditText)
  {
    AppMethodBeat.i(39725);
    this.jZg = paramMMEditText;
    paramMMEditText.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(39717);
        if (SnsUploadSayFooter.this.getVisibility() == 8)
          SnsUploadSayFooter.this.setVisibility(0);
        if (SnsUploadSayFooter.this.aYV())
          SnsUploadSayFooter.a(SnsUploadSayFooter.this);
        AppMethodBeat.o(39717);
      }
    });
    paramMMEditText.setOnEditorActionListener(new SnsUploadSayFooter.2(this));
    AppMethodBeat.o(39725);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter
 * JD-Core Version:    0.6.2
 */