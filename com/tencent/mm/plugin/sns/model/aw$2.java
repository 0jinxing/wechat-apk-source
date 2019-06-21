package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;

final class aw$2
  implements Runnable
{
  aw$2(aw paramaw)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    AppMethodBeat.i(36683);
    if (af.cnn())
    {
      ab.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
      AppMethodBeat.o(36683);
    }
    while (true)
    {
      return;
      aw.b(this.qNp);
      if (af.cnn())
      {
        ab.e("MicroMsg.UploadManager", "is invalid after checkTLE");
        AppMethodBeat.o(36683);
      }
      else
      {
        Object localObject2 = af.cnF();
        Object localObject3 = new n();
        String str = "select *,rowid from SnsInfo  where " + o.rfs + " order by SnsInfo.rowid asc ";
        localObject2 = ((o)localObject2).bSd.a(str, null, 2);
        ab.d("MicroMsg.SnsInfoStorage", "getLastUpload ".concat(String.valueOf(str)));
        if (!((Cursor)localObject2).moveToFirst())
        {
          ((Cursor)localObject2).close();
          localObject3 = localObject1;
        }
        while (true)
        {
          if (localObject3 != null)
            break label171;
          ab.d("MicroMsg.UploadManager", "All has post");
          AppMethodBeat.o(36683);
          break;
          ((n)localObject3).d((Cursor)localObject2);
          ((Cursor)localObject2).close();
        }
        label171: if (af.cnE().CR(((n)localObject3).reX))
        {
          ab.d("MicroMsg.UploadManager", "checking isPosting " + ((n)localObject3).reX);
          AppMethodBeat.o(36683);
        }
        else
        {
          ab.d("MicroMsg.UploadManager", "checking startPost " + ((n)localObject3).cqU());
          aw.a(this.qNp, (n)localObject3);
          AppMethodBeat.o(36683);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.aw.2
 * JD-Core Version:    0.6.2
 */