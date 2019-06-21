package com.tencent.mm.emoji.view;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.SmileyPanel;
import com.tencent.mm.api.u;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.ui.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/view/EmojiPanelBottomSheet;", "", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "darkMode", "", "(Landroid/content/Context;Landroid/view/ViewGroup;Z)V", "getContext", "()Landroid/content/Context;", "panelRoot", "Landroid/widget/FrameLayout;", "getParent", "()Landroid/view/ViewGroup;", "smileyPanel", "Lcom/tencent/mm/pluginsdk/ui/ChatFooterPanel;", "destroy", "", "dismiss", "isShow", "setCallback", "callback", "Lcom/tencent/mm/api/SmileyPanelCallbackWrapper$Callback;", "show", "plugin-emojisdk_release"})
public class a
{
  private final Context context;
  public final FrameLayout eAj;
  public final ChatFooterPanel eAk;
  private final ViewGroup eAl;

  public a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(63310);
    this.context = paramContext;
    this.eAl = paramViewGroup;
    this.eAj = new FrameLayout(this.context);
    paramContext = new ViewGroup.LayoutParams(-1, -1);
    this.eAl.addView((View)this.eAj, paramContext);
    this.eAj.setOnClickListener((View.OnClickListener)new a.1(this));
    paramContext = u.i(this.context, false);
    j.o(paramContext, "SmileyPanelFactory.getSm…yPanel(context, darkMode)");
    this.eAk = ((ChatFooterPanel)paramContext);
    this.eAk.AE();
    this.eAk.bf(true);
    this.eAk.j(true, true);
    this.eAk.setBackgroundColor(-1);
    this.eAk.setEntranceScene(ChatFooterPanel.vhl);
    this.eAk.onResume();
    paramContext = new FrameLayout.LayoutParams(-1, com.tencent.mm.bz.a.fromDPToPix(this.context, 230));
    paramContext.gravity = 80;
    this.eAj.setPadding(0, 0, 0, ak.fr(this.context));
    this.eAj.addView((View)this.eAk, (ViewGroup.LayoutParams)paramContext);
    this.eAj.setVisibility(8);
    ((SmileyPanel)this.eAk).setVisibility(8);
    ((SmileyPanel)this.eAk).setTranslationY(paramContext.height);
    AppMethodBeat.o(63310);
  }

  public void dismiss()
  {
    AppMethodBeat.i(63309);
    float f = this.eAk.getLayoutParams().height;
    this.eAk.animate().translationY(f).withEndAction((Runnable)new a.a(this));
    AppMethodBeat.o(63309);
  }

  public void show()
  {
    AppMethodBeat.i(63308);
    this.eAj.setVisibility(0);
    this.eAk.setVisibility(0);
    this.eAk.animate().translationY(0.0F).start();
    AppMethodBeat.o(63308);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.view.a
 * JD-Core Version:    0.6.2
 */