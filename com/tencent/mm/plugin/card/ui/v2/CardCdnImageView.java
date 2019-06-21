package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardCdnImageView;", "Lcom/tencent/mm/pluginsdk/ui/applet/CdnImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "init", "", "plugin-card_release"})
public final class CardCdnImageView extends CdnImageView
{
  public CardCdnImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(89176);
    init();
    AppMethodBeat.o(89176);
  }

  public CardCdnImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(89177);
    init();
    AppMethodBeat.o(89177);
  }

  private final void init()
  {
    AppMethodBeat.i(89175);
    setUseSdcardCache(true);
    setImgSavedPath(m.kdH + "/");
    AppMethodBeat.o(89175);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardCdnImageView
 * JD-Core Version:    0.6.2
 */