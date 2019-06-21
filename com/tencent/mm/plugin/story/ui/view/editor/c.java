package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/EditorMoreDialog;", "Landroid/support/design/widget/BottomSheetDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "favorite", "Landroid/view/View;", "favoriteIcon", "Landroid/widget/ImageView;", "favoriteTv", "Landroid/widget/TextView;", "isFavorite", "", "()Z", "setFavorite", "(Z)V", "isNotifySns", "setNotifySns", "notifySns", "notifySnsIcon", "notifySnsTv", "onNotifySns", "Lkotlin/Function0;", "", "getOnNotifySns", "()Lkotlin/jvm/functions/Function0;", "setOnNotifySns", "(Lkotlin/jvm/functions/Function0;)V", "onSetFav", "getOnSetFav", "setOnSetFav", "initFavoriteBtn", "initNotifySnsBtn", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "plugin-story_release"})
public final class c extends android.support.design.widget.c
{
  boolean rYr;
  private View slI;
  private TextView slJ;
  private ImageView slK;
  private View slL;
  private TextView slM;
  private ImageView slN;
  a.f.a.a<y> slO;
  a.f.a.a<y> slP;
  boolean slQ;

  public c(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(138926);
    this.slQ = true;
    setContentView(2130970879);
    AppMethodBeat.o(138926);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(138925);
    super.onCreate(paramBundle);
    paramBundle = getWindow();
    if (paramBundle != null)
    {
      paramBundle.addFlags(134218752);
      paramBundle.clearFlags(2);
    }
    this.slL = findViewById(2131828133);
    this.slM = ((TextView)findViewById(2131828135));
    this.slN = ((ImageView)findViewById(2131828134));
    this.slI = findViewById(2131828136);
    this.slJ = ((TextView)findViewById(2131828138));
    this.slK = ((ImageView)findViewById(2131828137));
    if (!com.tencent.mm.plugin.story.c.a.a.rQZ.cxh())
    {
      paramBundle = this.slI;
      if (paramBundle != null)
        paramBundle.setVisibility(8);
      if (com.tencent.mm.plugin.story.c.a.a.rQZ.cwU())
        break label344;
      paramBundle = this.slL;
      if (paramBundle != null)
        paramBundle.setVisibility(8);
      label150: paramBundle = findViewById(2131823264);
      if (paramBundle == null)
        break label469;
      paramBundle.setBackgroundResource(2131690597);
      AppMethodBeat.o(138925);
    }
    while (true)
    {
      return;
      paramBundle = this.slI;
      if (paramBundle != null)
        paramBundle.setVisibility(0);
      paramBundle = this.slI;
      if (paramBundle != null)
        paramBundle.setOnClickListener((View.OnClickListener)new c.b(this));
      Context localContext;
      if (this.slQ)
      {
        paramBundle = this.slJ;
        if (paramBundle != null)
        {
          localContext = getContext();
          j.o(localContext, "context");
          paramBundle.setText((CharSequence)localContext.getResources().getString(2131306011));
        }
        paramBundle = this.slK;
        if (paramBundle == null)
          break;
        paramBundle.setImageDrawable(ah.f(getContext(), 2131231472, -16777216));
        break;
      }
      paramBundle = this.slJ;
      if (paramBundle != null)
      {
        localContext = getContext();
        j.o(localContext, "context");
        paramBundle.setText((CharSequence)localContext.getResources().getString(2131306012));
      }
      paramBundle = this.slK;
      if (paramBundle == null)
        break;
      paramBundle.setImageDrawable(ah.f(getContext(), 2131231471, -16777216));
      break;
      label344: paramBundle = this.slL;
      if (paramBundle != null)
        paramBundle.setVisibility(0);
      paramBundle = this.slN;
      if (paramBundle != null)
        paramBundle.setImageDrawable(ah.f(getContext(), 2131231491, -16777216));
      paramBundle = this.slL;
      if (paramBundle != null)
        paramBundle.setOnClickListener((View.OnClickListener)new c.a(this));
      if (this.rYr)
      {
        paramBundle = this.slM;
        if (paramBundle == null)
          break label150;
        paramBundle.setText((CharSequence)getContext().getString(2131306003));
        break label150;
      }
      paramBundle = this.slM;
      if (paramBundle == null)
        break label150;
      paramBundle.setText((CharSequence)getContext().getString(2131306002));
      break label150;
      label469: AppMethodBeat.o(138925);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.c
 * JD-Core Version:    0.6.2
 */