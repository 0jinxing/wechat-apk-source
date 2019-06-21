package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.graphics.RectF;
import com.tencent.mm.media.editor.a.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/IEditorItemView;", "Lcom/tencent/mm/media/editor/item/IEditable;", "handleRemove", "", "pause", "", "resume", "setEditing", "editing", "setValidArea", "bounds", "Landroid/graphics/RectF;", "radius", "", "plugin-emojicapture_release"})
public abstract interface a extends h
{
  public abstract void a(RectF paramRectF, float paramFloat);

  public abstract boolean bob();

  public abstract void pause();

  public abstract void resume();

  public abstract void setEditing(boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.a
 * JD-Core Version:    0.6.2
 */