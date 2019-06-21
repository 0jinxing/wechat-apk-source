package com.tencent.mm.plugin.emoji.ui.v2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.v;

public class EmojiStoreV2HotBarView extends LinearLayout
{
  private View jcl;
  private View ldN;
  private TextView ldO;
  private View ldP;
  private TextView ldQ;
  private View.OnClickListener ldR;

  public EmojiStoreV2HotBarView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(53629);
    this.ldR = new EmojiStoreV2HotBarView.1(this);
    init();
    AppMethodBeat.o(53629);
  }

  public EmojiStoreV2HotBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(53630);
    this.ldR = new EmojiStoreV2HotBarView.1(this);
    init();
    AppMethodBeat.o(53630);
  }

  @TargetApi(11)
  public EmojiStoreV2HotBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(53633);
    this.ldR = new EmojiStoreV2HotBarView.1(this);
    init();
    AppMethodBeat.o(53633);
  }

  private void init()
  {
    AppMethodBeat.i(53634);
    this.jcl = ((ViewGroup)v.hu(getContext()).inflate(2130969365, this)).findViewById(2131820987);
    this.ldN = this.jcl.findViewById(2131823559);
    this.ldO = ((TextView)this.jcl.findViewById(2131823561));
    this.ldO.setText(getResources().getText(2131299123) + " ");
    this.ldP = this.jcl.findViewById(2131823550);
    this.ldP.setOnClickListener(new EmojiStoreV2HotBarView.2(this));
    this.ldQ = ((TextView)this.jcl.findViewById(2131823549));
    bmf();
    setMoreOnClickListener(this.ldR);
    AppMethodBeat.o(53634);
  }

  public final void bmf()
  {
    AppMethodBeat.i(53635);
    boolean bool = ((Boolean)g.RP().Ry().get(ac.a.xJn, Boolean.FALSE)).booleanValue();
    TextView localTextView;
    if (this.ldQ != null)
    {
      localTextView = this.ldQ;
      if (!bool)
        break label56;
    }
    label56: for (int i = 0; ; i = 8)
    {
      localTextView.setVisibility(i);
      AppMethodBeat.o(53635);
      return;
    }
  }

  public View getRootView()
  {
    return this.jcl;
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(53631);
    super.onAttachedToWindow();
    ab.d("MicroMsg.emoji.EmojiStoreV2HotBarView", "onAttachedToWindow");
    AppMethodBeat.o(53631);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(53632);
    super.onDetachedFromWindow();
    ab.d("MicroMsg.emoji.EmojiStoreV2HotBarView", "onAttachedToWindow");
    AppMethodBeat.o(53632);
  }

  public void setDesignerCatalogViewPadding(boolean paramBoolean)
  {
    AppMethodBeat.i(53638);
    if ((this.ldN != null) && (!paramBoolean))
    {
      int i = a.al(getContext(), 2131427785);
      int j = a.al(getContext(), 2131427796);
      int k = a.al(getContext(), 2131427812);
      this.ldN.setPadding(k, i, k, j);
    }
    AppMethodBeat.o(53638);
  }

  public void setDesignerEmojiViewVisibility(int paramInt)
  {
    AppMethodBeat.i(53637);
    if (this.ldP != null)
      this.ldP.setVisibility(paramInt);
    AppMethodBeat.o(53637);
  }

  public void setMoreOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(53636);
    if (this.ldO != null)
      this.ldO.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(53636);
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(53639);
    if (this.jcl != null)
    {
      this.jcl.setVisibility(paramInt);
      AppMethodBeat.o(53639);
    }
    while (true)
    {
      return;
      super.setVisibility(paramInt);
      AppMethodBeat.o(53639);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2HotBarView
 * JD-Core Version:    0.6.2
 */