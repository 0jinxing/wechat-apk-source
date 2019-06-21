package com.tencent.mm.plugin.emojicapture.ui.editor.a;

import a.l;
import android.graphics.Path;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.fontdecode.PathExtractor;
import com.tencent.mm.fontdecode.PathExtractor.Metrics;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/PathTextDrawer$TextPathData;", "", "fontPath", "", "textSize", "", "(Ljava/lang/String;I)V", "boxList", "", "Landroid/graphics/RectF;", "getBoxList", "()Ljava/util/List;", "metrics", "Lcom/tencent/mm/fontdecode/PathExtractor$Metrics;", "getMetrics", "()Lcom/tencent/mm/fontdecode/PathExtractor$Metrics;", "pathExtractor", "Lcom/tencent/mm/fontdecode/PathExtractor;", "pathList", "Landroid/graphics/Path;", "getPathList", "isValid", "", "refresh", "", "text", "", "plugin-emojicapture_release"})
public final class b$a
{
  final PathExtractor loE;
  final List<Path> loF;
  final List<RectF> loG;
  private final PathExtractor.Metrics loH;

  public b$a(String paramString, int paramInt)
  {
    AppMethodBeat.i(3134);
    this.loE = new PathExtractor(paramString);
    this.loH = new PathExtractor.Metrics();
    this.loE.setTextSize(paramInt);
    this.loF = ((List)new ArrayList());
    this.loG = ((List)new ArrayList());
    this.loE.a(this.loH);
    AppMethodBeat.o(3134);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.a.b.a
 * JD-Core Version:    0.6.2
 */