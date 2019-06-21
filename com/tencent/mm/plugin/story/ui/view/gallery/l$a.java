package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$Companion;", "", "()V", "ClickCountShowHint", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "getPullDownSpan", "Landroid/text/SpannableString;", "text", "", "color", "plugin-story_release"})
public final class l$a
{
  public static SpannableString l(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(110784);
    j.p(paramCharSequence, "text");
    Object localObject = com.tencent.mm.sdk.platformtools.ah.getContext();
    Drawable localDrawable = com.tencent.mm.ui.ah.f((Context)localObject, 2131232007, paramInt);
    localDrawable.setBounds(0, 0, com.tencent.mm.bz.a.fromDPToPix((Context)localObject, 14), com.tencent.mm.bz.a.fromDPToPix((Context)localObject, 20));
    localObject = new com.tencent.mm.ui.widget.a(localDrawable);
    paramCharSequence = new SpannableString((CharSequence)("#" + paramCharSequence));
    paramCharSequence.setSpan(localObject, 0, 1, 17);
    AppMethodBeat.o(110784);
    return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.a
 * JD-Core Version:    0.6.2
 */