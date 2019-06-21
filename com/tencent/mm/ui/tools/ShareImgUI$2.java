package com.tencent.mm.ui.tools;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.r;
import java.util.ArrayList;
import java.util.Iterator;

final class ShareImgUI$2
  implements ShareImgUI.b
{
  ShareImgUI$2(ShareImgUI paramShareImgUI)
  {
  }

  public final void aq(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(34936);
    this.zHr.zAu = paramArrayList;
    if ((this.zHr.zAu == null) || (this.zHr.zAu.size() == 0))
    {
      ab.e("MicroMsg.ShareImgUI", "launch : fail, filePathList is null");
      ShareImgUI.b(this.zHr);
      this.zHr.finish();
      AppMethodBeat.o(34936);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.zHr.zAu.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          paramArrayList = (String)localIterator.next();
          if (r.amo(paramArrayList))
          {
            ab.i("MicroMsg.ShareImgUI", "%s is not image", new Object[] { paramArrayList });
            ShareImgUI.b(this.zHr);
            this.zHr.finish();
            AppMethodBeat.o(34936);
            break;
          }
        }
      paramArrayList = this.zHr.getIntent().resolveType(this.zHr);
      if ((paramArrayList == null) || (!paramArrayList.contains("image")))
      {
        ab.i("MicroMsg.ShareImgUI", "mime type is not image, try to set it");
        this.zHr.getIntent().setDataAndType(this.zHr.getIntent().getData(), "image/*");
      }
      ShareImgUI.c(this.zHr);
      AppMethodBeat.o(34936);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareImgUI.2
 * JD-Core Version:    0.6.2
 */