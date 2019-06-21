package com.tencent.mm.plugin.story.ui.view.editor.item;

import a.f.b.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.media.editor.a.e;
import com.tencent.mm.media.editor.c.c;
import com.tencent.mm.plugin.story.ui.view.editor.PhotoEditText;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/item/TextItemView;", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/BitmapItemView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "textSize", "", "createBitmap", "Landroid/graphics/Bitmap;", "text", "", "textColor", "", "textBgColor", "reshowText", "", "viewMatrix", "Landroid/graphics/Matrix;", "setText", "setValidArea", "validRect", "Landroid/graphics/Rect;", "plugin-story_release"})
public final class f extends a
{
  private final float eOg;

  public f(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(110697);
    this.eOg = getResources().getDimension(2131428328);
    AppMethodBeat.o(110697);
  }

  public final void a(CharSequence paramCharSequence, int paramInt1, int paramInt2, Matrix paramMatrix)
  {
    AppMethodBeat.i(110695);
    j.p(paramMatrix, "viewMatrix");
    setText(paramCharSequence, paramInt1, paramInt2);
    setViewMatrix(paramMatrix);
    setSourceDataType(e.eUm);
    AppMethodBeat.o(110695);
  }

  public final Bitmap f(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110696);
    setSourceDataType(e.eUm);
    Object localObject = getContext();
    j.o(localObject, "context");
    localObject = new PhotoEditText((Context)localObject);
    int i = com.tencent.mm.bz.a.fromDPToPix(getContext(), 16);
    int j = com.tencent.mm.bz.a.fromDPToPix(getContext(), 8);
    ((PhotoEditText)localObject).setPadding(i, j, i, j);
    ((PhotoEditText)localObject).setTextColor(paramInt1);
    ((PhotoEditText)localObject).setTextBackground(paramInt2);
    ((PhotoEditText)localObject).setTextSize(0, this.eOg);
    ((PhotoEditText)localObject).setText(paramCharSequence);
    ((PhotoEditText)localObject).setSingleLine(false);
    ((PhotoEditText)localObject).setTypeface(((PhotoEditText)localObject).getTypeface(), 1);
    if ((paramInt2 == 0) && (paramInt1 != -16777216))
      b.f((TextView)localObject);
    paramCharSequence = com.tencent.mm.plugin.story.f.l.sac;
    paramInt1 = com.tencent.mm.plugin.story.f.l.czI().width();
    if (paramInt1 > 0)
      ((PhotoEditText)localObject).setMaxWidth(paramInt1);
    ((PhotoEditText)localObject).measure(0, 0);
    paramCharSequence = Bitmap.createBitmap(((PhotoEditText)localObject).getMeasuredWidth(), ((PhotoEditText)localObject).getMeasuredHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(paramCharSequence);
    ((PhotoEditText)localObject).draw(localCanvas);
    localCanvas.save();
    localCanvas.translate(i, j);
    ((PhotoEditText)localObject).getLayout().draw(localCanvas);
    localCanvas.restore();
    j.o(paramCharSequence, "bitmap");
    AppMethodBeat.o(110696);
    return paramCharSequence;
  }

  public final void setText(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110694);
    Bitmap localBitmap = f(paramCharSequence, paramInt1, paramInt2);
    setText(paramCharSequence);
    setSourceDataType(e.eUm);
    setColor(paramInt1);
    setTextBg(paramInt2);
    paramCharSequence = getBitmap();
    if (paramCharSequence != null)
      getTouchTracker().aKk.preTranslate(paramCharSequence.getWidth() / 2.0F, paramCharSequence.getHeight() / 2.0F);
    setBitmap(localBitmap);
    postInvalidate();
    AppMethodBeat.o(110694);
  }

  public final void setValidArea(Rect paramRect)
  {
    AppMethodBeat.i(110693);
    j.p(paramRect, "validRect");
    getTouchTracker().aKk.postTranslate(paramRect.width() / 2.0F, paramRect.height() * 0.7F);
    AppMethodBeat.o(110693);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.item.f
 * JD-Core Version:    0.6.2
 */