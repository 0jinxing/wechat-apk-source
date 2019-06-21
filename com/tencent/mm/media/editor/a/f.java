package com.tencent.mm.media.editor.a;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.mm.emoji.decode.MMGIFJNIFactory.Companion;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/item/EmojiEditorItem;", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "matrix", "Landroid/graphics/Matrix;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;Landroid/graphics/Matrix;)V", "TAG", "", "decoder", "Lcom/tencent/mm/emoji/decode/IGIFDecoder;", "lastValidFrame", "Landroid/graphics/Bitmap;", "consumeTime", "", "lastFrameTime", "destroy", "", "draw", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "init", "prepareNext", "plugin-mediaeditor_release"})
public final class f extends b
{
  private final String TAG;
  private final Matrix aKk;
  private com.tencent.mm.emoji.decode.b eUq;
  private EmojiInfo exP;
  private Bitmap exl;

  public f(EmojiInfo paramEmojiInfo, Matrix paramMatrix)
  {
    AppMethodBeat.i(12888);
    this.exP = paramEmojiInfo;
    this.aKk = paramMatrix;
    this.TAG = "MicroMsg.EmojiEditorItem";
    AppMethodBeat.o(12888);
  }

  public final long UH()
  {
    AppMethodBeat.i(12886);
    com.tencent.mm.emoji.decode.b localb = this.eUq;
    if (localb == null)
      j.avw("decoder");
    localb.Or();
    localb = this.eUq;
    if (localb == null)
      j.avw("decoder");
    this.exl = localb.Os();
    localb = this.eUq;
    if (localb == null)
      j.avw("decoder");
    long l = localb.Ot();
    AppMethodBeat.o(12886);
    return l;
  }

  public final void destroy()
  {
    AppMethodBeat.i(12887);
    com.tencent.mm.emoji.decode.b localb = this.eUq;
    if (localb == null)
      j.avw("decoder");
    localb.destroy();
    AppMethodBeat.o(12887);
  }

  public final void draw(Canvas paramCanvas, Paint paramPaint)
  {
    AppMethodBeat.i(12884);
    j.p(paramCanvas, "canvas");
    j.p(paramPaint, "paint");
    paramCanvas.save();
    paramCanvas.concat(this.aKk);
    if (this.exl != null)
    {
      Bitmap localBitmap = this.exl;
      if (localBitmap == null)
        j.dWJ();
      paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, paramPaint);
    }
    paramCanvas.restore();
    AppMethodBeat.o(12884);
  }

  public final long ff(long paramLong)
  {
    AppMethodBeat.i(12885);
    ab.d(this.TAG, "request time is " + paramLong + ", curr frame is " + this.eUj);
    paramLong = super.ff(paramLong);
    AppMethodBeat.o(12885);
    return paramLong;
  }

  public final void init()
  {
    AppMethodBeat.i(12883);
    ab.d(this.TAG, "filepath is " + this.exP.dve());
    this.eUq = MMGIFJNIFactory.Companion.getDecoder(this.exP);
    AppMethodBeat.o(12883);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.a.f
 * JD-Core Version:    0.6.2
 */