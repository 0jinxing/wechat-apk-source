package com.tencent.mm.console.a.b;

import android.content.Context;
import android.database.Cursor;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.e;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.List;

public class a
  implements com.tencent.mm.pluginsdk.cmd.a
{
  private static final int[] ewC = { 0, 1 };

  static
  {
    AppMethodBeat.i(16172);
    try
    {
      Object localObject = Class.forName("com.tencent.mm.console.a.b.a").newInstance();
      if ((localObject != null) && ((localObject instanceof com.tencent.mm.pluginsdk.cmd.a)))
        com.tencent.mm.pluginsdk.cmd.b.a((com.tencent.mm.pluginsdk.cmd.a)localObject, new String[] { "//aging" });
      AppMethodBeat.o(16172);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AgingTestCommand", localThrowable, "", new Object[0]);
        AppMethodBeat.o(16172);
      }
    }
  }

  private static ad G(String paramString, int paramInt)
  {
    AppMethodBeat.i(16161);
    ad localad = new ad();
    localad.ewQ = (100000 + paramInt);
    localad.setUsername(paramString);
    localad.iy("alias_".concat(String.valueOf(paramInt)));
    localad.iB("nickName_".concat(String.valueOf(paramInt)));
    localad.iD("quanPin_".concat(String.valueOf(paramInt)));
    localad.iC("pyInitial_".concat(String.valueOf(paramInt)));
    localad.setType(3);
    AppMethodBeat.o(16161);
    return localad;
  }

  private static byte[] eX(long paramLong)
  {
    int i = (byte)(int)(paramLong & 0xFF);
    int j = (byte)(int)(paramLong >> 8 & 0xFF);
    int k = (byte)(int)(paramLong >> 16 & 0xFF);
    int m = (byte)(int)(paramLong >> 24 & 0xFF);
    int n = (byte)(int)(paramLong >> 32 & 0xFF);
    int i1 = (byte)(int)(paramLong >> 40 & 0xFF);
    int i2 = (byte)(int)(paramLong >> 48 & 0xFF);
    return new byte[] { (byte)(int)(paramLong >> 56 & 0xFF), i2, i1, n, m, k, j, i };
  }

  private static int je(int paramInt)
  {
    AppMethodBeat.i(16160);
    int i = (int)(Math.random() * paramInt);
    int j = i;
    if (i >= paramInt)
      j = 0;
    AppMethodBeat.o(16160);
    return j;
  }

  public final boolean a(final Context paramContext, final String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(16159);
    boolean bool;
    if (ab.getLogLevel() > 1)
    {
      bool = false;
      AppMethodBeat.o(16159);
    }
    while (true)
    {
      label22: return bool;
      if (paramArrayOfString.length <= 1)
      {
        bool = false;
        AppMethodBeat.o(16159);
      }
      else
      {
        Object localObject1 = r.Yz();
        final b localb = new b();
        for (int i = 5001; i <= 6000; i++)
          localb.ewK.add("rdgztest_atm".concat(String.valueOf(i)));
        paramString = ((j)g.K(j.class)).bOr().bOy();
        localObject1 = paramString.a("SELECT * FROM message WHERE talker=? AND (type=3 OR type=43 OR type=47) AND isSend=1", new String[] { localObject1 }, 0);
        while (((Cursor)localObject1).moveToNext())
        {
          bi localbi = new bi();
          localbi.d((Cursor)localObject1);
          Object localObject2;
          Object localObject3;
          switch (localbi.getType())
          {
          default:
            break;
          case 3:
            localObject2 = paramString.a("SELECT * FROM ImgInfo2 WHERE msgSvrId=?", new String[] { String.valueOf(localbi.field_msgSvrId) }, 0);
            if (((Cursor)localObject2).moveToNext())
            {
              localObject3 = new e();
              ((e)localObject3).d((Cursor)localObject2);
              localb.ewL.add(new c(localbi, localObject3));
            }
            ((Cursor)localObject2).close();
            break;
          case 43:
            localObject3 = paramString.a("SELECT * FROM videoinfo2 WHERE msgsvrid=?", new String[] { String.valueOf(localbi.field_msgSvrId) }, 0);
            if (((Cursor)localObject3).moveToNext())
            {
              localObject2 = new s();
              ((s)localObject2).d((Cursor)localObject3);
              localb.ewM.add(new c(localbi, localObject2));
            }
            ((Cursor)localObject3).close();
            break;
          case 47:
            localObject2 = paramString.a("SELECT * FROM EmojiInfo WHERE md5=?", new String[] { localbi.field_imgPath }, 0);
            if (((Cursor)localObject2).moveToNext())
            {
              localObject3 = new EmojiInfo();
              ((EmojiInfo)localObject3).d((Cursor)localObject2);
              localb.ewN.add(new c(localbi, localObject3));
            }
            ((Cursor)localObject2).close();
          }
        }
        ((Cursor)localObject1).close();
        if ((localb.ewL.isEmpty()) && (localb.ewN.isEmpty()) && (localb.ewM.isEmpty()))
        {
          Toast.makeText(paramContext, "please send some data(img,video,emoji) to yourself", 1).show();
          bool = false;
          AppMethodBeat.o(16159);
        }
        else
        {
          ab.i("MicroMsg.AgingTestCommand", "[oneliang]username size:%s,image size:%s,emoji size:%s,video size:%s", new Object[] { Integer.valueOf(localb.ewK.size()), Integer.valueOf(localb.ewL.size()), Integer.valueOf(localb.ewN.size()), Integer.valueOf(localb.ewM.size()) });
          if (paramArrayOfString.length == 2)
          {
            Toast.makeText(paramContext, "aging begin", 1).show();
            aw.RS().aa(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(16154);
                a.R(localb.ewK);
                a.a(a.this, null, bo.getInt(paramArrayOfString[1], 0), localb);
                a.a(a.this, paramContext);
                AppMethodBeat.o(16154);
              }
            });
            bool = true;
            AppMethodBeat.o(16159);
          }
          else if (paramArrayOfString.length < 3)
          {
            bool = false;
            AppMethodBeat.o(16159);
          }
          else
          {
            int j = bo.getInt(paramArrayOfString[2], 0);
            paramString = paramArrayOfString[1];
            i = -1;
            switch (paramString.hashCode())
            {
            default:
            case 49:
            case 50:
            case 51:
            }
            while (true)
              switch (i)
              {
              default:
                bool = true;
                AppMethodBeat.o(16159);
                break label22;
                if (paramString.equals("1"))
                {
                  i = 0;
                  continue;
                  if (paramString.equals("2"))
                  {
                    i = 1;
                    continue;
                    if (paramString.equals("3"))
                      i = 2;
                  }
                }
                break;
              case 0:
              case 1:
              case 2:
              }
            aw.RS().aa(new a.2(this, j, paramContext));
            bool = true;
            AppMethodBeat.o(16159);
            continue;
            paramString = null;
            if (paramArrayOfString.length == 4)
              paramString = paramArrayOfString[3];
            aw.RS().aa(new a.3(this, paramString, j, localb, paramContext));
            bool = true;
            AppMethodBeat.o(16159);
            continue;
            bool = true;
            AppMethodBeat.o(16159);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.b.a
 * JD-Core Version:    0.6.2
 */