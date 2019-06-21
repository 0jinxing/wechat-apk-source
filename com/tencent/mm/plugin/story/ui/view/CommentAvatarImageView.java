package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.i;
import com.tencent.mm.plugin.story.model.r;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/CommentAvatarImageView;", "Landroid/widget/ImageView;", "Lcom/tencent/mm/plugin/story/api/IStoryStatusNotifyListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hintBgColor", "hintProxy", "Lcom/tencent/mm/plugin/story/api/IStoryHintProxy;", "tagName", "", "withHintBg", "", "getWithHintBg", "()Z", "setWithHintBg", "(Z)V", "bindUsername", "", "userName", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onNotifyStoryStatusChanged", "username", "isRead", "setShowStoryHint", "show", "plugin-story_release"})
public final class CommentAvatarImageView extends ImageView
  implements com.tencent.mm.plugin.story.api.l
{
  public final i rDe;
  public String rMJ;
  private final int sio;
  private boolean sip;

  public CommentAvatarImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110335);
    AppMethodBeat.o(110335);
  }

  public CommentAvatarImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110334);
    this.rMJ = "";
    setLayerType(1, null);
    this.rDe = r.rTS.eW(paramContext);
    this.rDe.aR((View)this);
    this.sio = getResources().getColor(2131690525);
    AppMethodBeat.o(110334);
  }

  public final void br(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(110333);
    j.p(paramString, "username");
    if ((TextUtils.isEmpty((CharSequence)paramString)) || (getContext() == null))
    {
      AppMethodBeat.o(110333);
      return;
    }
    if (j.j(paramString, this.rMJ))
      if (paramBoolean)
        break label64;
    label64: for (paramBoolean = true; ; paramBoolean = false)
    {
      setShowStoryHint(paramBoolean);
      AppMethodBeat.o(110333);
      break;
    }
  }

  public final boolean getWithHintBg()
  {
    return this.sip;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(110331);
    j.p(paramCanvas, "canvas");
    super.onDraw(paramCanvas);
    i locali = this.rDe;
    if (this.sip);
    for (int i = this.sio; ; i = 0)
    {
      locali.a(paramCanvas, false, i);
      AppMethodBeat.o(110331);
      return;
    }
  }

  public final void setShowStoryHint(boolean paramBoolean)
  {
    AppMethodBeat.i(110332);
    this.rDe.setShowStoryHint(paramBoolean);
    AppMethodBeat.o(110332);
  }

  public final void setWithHintBg(boolean paramBoolean)
  {
    this.sip = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView
 * JD-Core Version:    0.6.2
 */