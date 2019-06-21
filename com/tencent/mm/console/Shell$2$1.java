package com.tencent.mm.console;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;

final class Shell$2$1
  implements Runnable
{
  Shell$2$1(Shell.2 param2, String paramString)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    com.tencent.wcdb.Cursor localCursor = null;
    AppMethodBeat.i(16108);
    Object localObject2 = g.RP().eJN.dvx();
    Object localObject3 = localCursor;
    Object localObject5 = localObject1;
    while (true)
    {
      long l;
      try
      {
        l = System.currentTimeMillis();
        localObject3 = localCursor;
        localObject5 = localObject1;
        localCursor = ((SQLiteDatabase)localObject2).rawQueryWithFactory(SQLiteDirectCursor.FACTORY, this.ewz, null, null);
        localObject3 = localCursor;
        localObject5 = localCursor;
        localObject1 = localCursor.getColumnNames();
        int i;
        int j;
        if (localObject1 == null)
        {
          i = 0;
          localObject3 = localCursor;
          localObject5 = localCursor;
          localObject2 = new java/lang/StringBuilder;
          localObject3 = localCursor;
          localObject5 = localCursor;
          ((StringBuilder)localObject2).<init>("Executing SQL from shell: ");
          localObject3 = localCursor;
          localObject5 = localCursor;
          ab.i("MicroMsg.Shell", this.ewz);
          if (i > 0)
          {
            localObject3 = localCursor;
            localObject5 = localCursor;
            localObject2 = new java/lang/StringBuilder;
            localObject3 = localCursor;
            localObject5 = localCursor;
            ((StringBuilder)localObject2).<init>(" > ");
            localObject3 = localCursor;
            localObject5 = localCursor;
            ab.i("MicroMsg.Shell", TextUtils.join(" | ", (Object[])localObject1));
          }
          localObject3 = localCursor;
          localObject5 = localCursor;
          localObject1 = new java/lang/StringBuilder;
          localObject3 = localCursor;
          localObject5 = localCursor;
          ((StringBuilder)localObject1).<init>(1024);
          localObject3 = localCursor;
          localObject5 = localCursor;
          if (!localCursor.moveToNext())
            break label453;
          localObject3 = localCursor;
          localObject5 = localCursor;
          ((StringBuilder)localObject1).setLength(0);
          localObject3 = localCursor;
          localObject5 = localCursor;
          ((StringBuilder)localObject1).append(" > ");
          j = 0;
          if (j < i)
          {
            localObject3 = localCursor;
            localObject5 = localCursor;
          }
        }
        else
        {
          switch (localCursor.getType(j))
          {
          default:
            localObject3 = localCursor;
            localObject5 = localCursor;
            ((StringBuilder)localObject1).append(localCursor.getString(j));
            localObject3 = localCursor;
            localObject5 = localCursor;
            ((StringBuilder)localObject1).append(" | ");
            j++;
            continue;
            localObject3 = localCursor;
            localObject5 = localCursor;
            i = localObject1.length;
            break;
          case 0:
            localObject3 = localCursor;
            localObject5 = localCursor;
            ((StringBuilder)localObject1).append("(null)");
            continue;
          case 4:
          }
        }
      }
      catch (RuntimeException localRuntimeException1)
      {
        localObject5 = localObject3;
        ab.e("MicroMsg.Shell", "Failed to execute SQL '%s': %s", new Object[] { this.ewz, localRuntimeException1.getMessage() });
        return;
        localObject3 = localRuntimeException1;
        localObject5 = localRuntimeException1;
        ((StringBuilder)localObject1).append("(blob)");
        continue;
      }
      finally
      {
        if (localObject5 != null)
          ((android.database.Cursor)localObject5).close();
        AppMethodBeat.o(16108);
      }
      RuntimeException localRuntimeException2 = localRuntimeException1;
      localObject5 = localRuntimeException1;
      ab.i("MicroMsg.Shell", ((StringBuilder)localObject1).toString());
      continue;
      label453: localRuntimeException2 = localRuntimeException1;
      localObject5 = localRuntimeException1;
      ab.i("MicroMsg.Shell", "Finish executing SQL in %d ms: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), this.ewz });
      if (localRuntimeException1 != null)
      {
        localRuntimeException1.close();
        AppMethodBeat.o(16108);
      }
      else
      {
        AppMethodBeat.o(16108);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.2.1
 * JD-Core Version:    0.6.2
 */