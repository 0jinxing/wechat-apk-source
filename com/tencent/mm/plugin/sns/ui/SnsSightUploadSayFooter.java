package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.List;

public class SnsSightUploadSayFooter extends BasePanelKeybordLayout
{
  MMActivity crP;
  ChatFooterPanel eAk;
  private MMEditText jZg;
  private ImageButton jZh;
  private boolean oin;
  SightRangeWidget rwY;
  SightLocationWidget rwZ;

  public SnsSightUploadSayFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(39291);
    this.jZg = null;
    this.oin = true;
    this.crP = ((MMActivity)paramContext);
    paramContext = (ViewGroup)inflate(this.crP, 2130970798, this);
    this.jZh = ((ImageButton)paramContext.findViewById(2131825682));
    this.jZh.setOnClickListener(new SnsSightUploadSayFooter.4(this));
    if (e.vom == null)
      this.eAk = new d(this.crP);
    while (true)
    {
      this.rwY = ((SightRangeWidget)paramContext.findViewById(2131825683));
      this.rwY.rhg = null;
      this.rwY.style = 1;
      this.rwZ = ((SightLocationWidget)paramContext.findViewById(2131827846));
      AppMethodBeat.o(39291);
      return;
      this.eAk = e.vom.dF(getContext());
      this.eAk.setEntranceScene(ChatFooterPanel.vhj);
      this.eAk.setVisibility(8);
      ((LinearLayout)findViewById(2131820987)).addView(this.eAk, -1, 0);
      this.eAk.AD();
      this.eAk.bf(false);
      this.eAk.setOnTextOperationListener(new SnsSightUploadSayFooter.5(this));
    }
  }

  private void aRe()
  {
    AppMethodBeat.i(39293);
    this.eAk.onPause();
    this.eAk.setVisibility(8);
    AppMethodBeat.o(39293);
  }

  public ayt getLocation()
  {
    AppMethodBeat.i(39295);
    ayt localayt = this.rwZ.getLocation();
    AppMethodBeat.o(39295);
    return localayt;
  }

  public List<View> getPanelView()
  {
    AppMethodBeat.i(39294);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.eAk);
    AppMethodBeat.o(39294);
    return localArrayList;
  }

  public void setMMEditText(MMEditText paramMMEditText)
  {
    AppMethodBeat.i(39292);
    this.jZg = paramMMEditText;
    paramMMEditText.setOnClickListener(new SnsSightUploadSayFooter.1(this));
    paramMMEditText.setOnEditorActionListener(new SnsSightUploadSayFooter.2(this));
    al.n(new SnsSightUploadSayFooter.3(this), 200L);
    AppMethodBeat.o(39292);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter
 * JD-Core Version:    0.6.2
 */