package com.tencent.mm.plugin.nearlife.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.mn.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

final class SelectPoiCategoryUI$a extends c<mn>
{
  SelectPoiCategoryUI oST;

  public SelectPoiCategoryUI$a(SelectPoiCategoryUI paramSelectPoiCategoryUI)
  {
    super(0);
    AppMethodBeat.i(23000);
    this.xxI = mn.class.getName().hashCode();
    AppMethodBeat.o(23000);
  }

  private boolean a(mn parammn)
  {
    AppMethodBeat.i(23001);
    SelectPoiCategoryUI localSelectPoiCategoryUI;
    Object localObject;
    if ((parammn instanceof mn))
    {
      localSelectPoiCategoryUI = this.oST;
      parammn = parammn.cIq.content;
      localObject = new File(SelectPoiCategoryUI.oSN);
      if (!((File)localObject).exists())
        ((File)localObject).mkdir();
    }
    try
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = SelectPoiCategoryUI.oSN + "/lastest_poi_categories.dat";
      localObject = new java/io/File;
      ((File)localObject).<init>(str);
      if (!((File)localObject).exists())
        ((File)localObject).createNewFile();
      e.b(str, parammn, parammn.length);
      localSelectPoiCategoryUI.bc(parammn);
      localSelectPoiCategoryUI.bVr();
      AppMethodBeat.o(23001);
      return false;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.SelectPoiCategoryUI", "write file failed: " + localException.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI.a
 * JD-Core Version:    0.6.2
 */