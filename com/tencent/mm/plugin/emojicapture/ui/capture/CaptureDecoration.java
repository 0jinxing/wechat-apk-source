package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.f.b.j;
import a.k.m;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.plugin.emojicapture.model.c;
import com.tencent.mm.plugin.emojicapture.model.c.a;
import com.tencent.mm.plugin.emojicapture.ui.a;
import com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/capture/CaptureDecoration;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clipPath", "Landroid/graphics/Path;", "clipRadius", "", "clipRect", "Landroid/graphics/RectF;", "emojiHint", "Lcom/tencent/mm/emoji/view/BaseEmojiView;", "firstSelect", "", "hideStickerHintRunnable", "Ljava/lang/Runnable;", "imitateEmoji", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "showStickerHintRunnable", "stickerHint", "Landroid/view/View;", "stickerHintIcon", "Landroid/widget/ImageView;", "stickerHintText", "Landroid/widget/TextView;", "stickerInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "textHint", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/TextEditorItemView;", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "getText", "", "getTextColor", "hideStickerHint", "onRecordStart", "onRecordStop", "pause", "resume", "setImitateEmoji", "emojiInfo", "setStickerInfo", "showImitateEmoji", "showStickerHint", "showTextHint", "text", "colorString", "plugin-emojicapture_release"})
public final class CaptureDecoration extends FrameLayout
{
  com.tencent.mm.plugin.emojicapture.model.a.b lhH;
  private final Path lkh;
  public final TextEditorItemView lmA;
  final View lmB;
  final ImageView lmC;
  final TextView lmD;
  private EmojiInfo lmE;
  private boolean lmF;
  private final Runnable lmG;
  final Runnable lmH;
  private final RectF lmx;
  private final float lmy;
  public final BaseEmojiView lmz;

  public CaptureDecoration(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(3000);
    AppMethodBeat.o(3000);
  }

  public CaptureDecoration(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(2999);
    this.lkh = new Path();
    this.lmx = new RectF();
    this.lmy = paramContext.getResources().getDimension(2131427333);
    this.lmF = true;
    this.lmG = ((Runnable)new CaptureDecoration.c(this));
    this.lmH = ((Runnable)new CaptureDecoration.b(this));
    View.inflate(paramContext, 2130969327, (ViewGroup)this);
    paramAttributeSet = findViewById(2131823436);
    j.o(paramAttributeSet, "findViewById(R.id.emoji_capture_emoji_hint)");
    this.lmz = ((BaseEmojiView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823440);
    j.o(paramAttributeSet, "findViewById(R.id.emoji_capture_text_hint)");
    this.lmA = ((TextEditorItemView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823437);
    j.o(paramAttributeSet, "findViewById(R.id.emoji_capture_sticker_hint)");
    this.lmB = paramAttributeSet;
    paramAttributeSet = findViewById(2131823438);
    j.o(paramAttributeSet, "findViewById(R.id.emoji_capture_sticker_hint_icon)");
    this.lmC = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823439);
    j.o(paramAttributeSet, "findViewById(R.id.emoji_capture_sticker_hint_text)");
    this.lmD = ((TextView)paramAttributeSet);
    float f = paramContext.getResources().getDimension(2131427334);
    paramContext = new RectF(0.0F, 0.0F, f, f);
    this.lmA.a(paramContext, this.lmy);
    AppMethodBeat.o(2999);
  }

  private void bnZ()
  {
    AppMethodBeat.i(2994);
    EmojiInfo localEmojiInfo = this.lmE;
    Object localObject;
    if (localEmojiInfo != null)
    {
      this.lmz.setVisibility(0);
      this.lmz.setEmojiInfo(localEmojiInfo);
      if (com.tencent.mm.plugin.emoji.h.b.w(localEmojiInfo))
      {
        localObject = g.M(d.class);
        j.o(localObject, "plugin(IPluginEmoji::class.java)");
        localObject = ((d)localObject).getProvider().Jh(localEmojiInfo.Aq());
        dP((String)localObject, localEmojiInfo.field_attachTextColor);
        AppMethodBeat.o(2994);
      }
    }
    while (true)
    {
      return;
      localObject = localEmojiInfo.field_attachedText;
      break;
      AppMethodBeat.o(2994);
    }
  }

  private void dP(String paramString1, String paramString2)
  {
    AppMethodBeat.i(2995);
    if (!bo.isNullOrNil(paramString1))
    {
      Object localObject = (CharSequence)paramString2;
      if ((localObject != null) && (!m.ar((CharSequence)localObject)))
        break label79;
      i = 1;
      if (i != 0)
        break label85;
      localObject = c.lhw;
    }
    label79: label85: for (int i = a.uA(c.a.Ka(paramString2)); ; i = -1)
    {
      this.lmA.a((CharSequence)paramString1, i, true);
      this.lmA.setVisibility(0);
      AppMethodBeat.o(2995);
      return;
      i = 0;
      break;
    }
  }

  protected final void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(2991);
    j.p(paramCanvas, "canvas");
    this.lmx.set(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight());
    this.lkh.addRoundRect(this.lmx, this.lmy, this.lmy, Path.Direction.CW);
    paramCanvas.clipPath(this.lkh);
    super.dispatchDraw(paramCanvas);
    AppMethodBeat.o(2991);
  }

  public final String getText()
  {
    AppMethodBeat.i(2996);
    Object localObject = this.lmA.getText();
    if (localObject != null)
    {
      localObject = localObject.toString();
      AppMethodBeat.o(2996);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(2996);
    }
  }

  public final int getTextColor()
  {
    AppMethodBeat.i(2997);
    int i = this.lmA.getTextColor();
    if (i != 0);
    for (i = a.uA(i); ; i = -1)
    {
      AppMethodBeat.o(2997);
      return i;
    }
  }

  public final void resume()
  {
    AppMethodBeat.i(2998);
    this.lmz.resume();
    this.lmA.boc();
    AppMethodBeat.o(2998);
  }

  public final void setImitateEmoji(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(2992);
    this.lmE = paramEmojiInfo;
    bnZ();
    AppMethodBeat.o(2992);
  }

  public final void setStickerInfo(com.tencent.mm.plugin.emojicapture.model.a.b paramb)
  {
    Object localObject1 = null;
    AppMethodBeat.i(2993);
    String str;
    if ((j.j(this.lhH, paramb) ^ true))
    {
      this.lhH = paramb;
      this.lmB.setVisibility(8);
      this.lmz.setVisibility(8);
      this.lmA.setVisibility(8);
      this.lmA.a(null, -1, true);
      removeCallbacks(this.lmH);
      removeCallbacks(this.lmG);
      if (paramb != null)
      {
        str = paramb.title;
        if (this.lmE == null)
          break label311;
        Object localObject2 = paramb.lgY;
        localObject3 = this.lmE;
        if (localObject3 != null)
        {
          localObject3 = ((EmojiInfo)localObject3).field_lensId;
          if ((!j.j(localObject2, localObject3)) || (!this.lmF))
            break label311;
          this.lmF = false;
          localObject2 = this.lmE;
          localObject3 = localObject1;
          if (localObject2 != null)
            localObject3 = ((EmojiInfo)localObject2).field_attachedText;
          if (bo.isNullOrNil((String)localObject3))
            break label311;
          localObject3 = this.lmE;
          if (localObject3 != null)
          {
            str = ((EmojiInfo)localObject3).field_attachedText;
            localObject3 = str;
            if (str != null)
              break label201;
          }
        }
      }
    }
    label302: label311: for (Object localObject3 = ""; ; localObject3 = str)
    {
      label201: dP((String)localObject3, paramb.fhL);
      int i;
      if ((!m.ar((CharSequence)paramb.kfM)) || (!paramb.lhM.isEmpty()))
      {
        i = 1;
        label237: if (i == 0)
          break label302;
        postDelayed(this.lmG, 500L);
        AppMethodBeat.o(2993);
      }
      while (true)
      {
        return;
        localObject3 = null;
        break;
        i = 0;
        break label237;
        if (this.lmE != null)
        {
          bnZ();
          AppMethodBeat.o(2993);
        }
        else
        {
          this.lmz.setVisibility(8);
          AppMethodBeat.o(2993);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration
 * JD-Core Version:    0.6.2
 */