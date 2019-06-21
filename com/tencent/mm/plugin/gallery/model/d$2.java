package com.tencent.mm.plugin.gallery.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Vector;

final class d$2
  implements d.b
{
  d$2(d paramd)
  {
  }

  public final void NA(String paramString)
  {
    AppMethodBeat.i(21241);
    ab.i("MicroMsg.GalleryCache", "now listener size : " + this.mNI.ghp.size());
    int i = this.mNI.ghp.size() - 1;
    while (true)
      if (i >= 0)
        try
        {
          d.b localb = (d.b)this.mNI.ghp.get(i);
          if (localb == null)
          {
            ab.d("MicroMsg.GalleryCache", "get listener is null! filePath:%s", new Object[] { paramString });
            i--;
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.GalleryCache", "get wathcer failed:[%s] filePath:%s", new Object[] { localException.toString(), paramString });
            Object localObject = null;
            continue;
            localObject.NA(paramString);
          }
        }
    AppMethodBeat.o(21241);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.d.2
 * JD-Core Version:    0.6.2
 */