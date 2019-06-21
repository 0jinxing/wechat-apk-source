package com.tencent.pb.common.b;

import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.pb.common.b.a.a.u;
import com.tencent.pb.common.b.a.a.v;
import com.tencent.pb.common.c.d;
import com.tencent.wecall.talkroom.model.h;
import java.util.Iterator;
import java.util.LinkedList;

public class f
{
  private static f Ama = null;
  private int Amb = 0;
  private LinkedList<f.a> Amc = null;
  public com.tencent.pb.talkroom.sdk.e Amd = null;
  private boolean Ame = false;
  private boolean Amf = true;

  private int a(a arg1, c paramc, String paramString, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    Object localObject = null;
    int i = dPw();
    try
    {
      if ((paramArrayOfByte.length >= 200) && (paramArrayOfByte != null) && (paramArrayOfByte.length >= paramArrayOfByte.length));
      a.u localu = new com/tencent/pb/common/b/a/a$u;
      localu.<init>();
      localu.Cn = paramInt1;
      localu.AnK = i;
      localu.userName = com.tencent.pb.a.a.a.dPM();
      localu.AmC = paramInt2;
      if (paramArrayOfByte == null)
        com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "body null" });
      for (paramArrayOfByte = (byte[])localObject; paramArrayOfByte == null; paramArrayOfByte = com.google.a.a.e.b((com.google.a.a.e)localObject))
      {
        com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "cmd:" + paramInt1 + "|body is null" });
        paramInt1 = -1;
        return paramInt1;
        localObject = new com/tencent/pb/common/b/a/a$v;
        ((a.v)localObject).<init>();
        ((a.v)localObject).AnM = localu;
        ((a.v)localObject).body = paramArrayOfByte;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("NetError", new Object[] { "newTaskHelper addTask body null" });
        paramArrayOfByte = null;
        continue;
        if (paramArrayOfByte.length <= 61440)
          break;
        com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "cmd:" + paramInt1 + "|body too large" });
        paramInt1 = -1;
      }
      localObject = new f.a(this, (byte)0);
      ((f.a)localObject).mTaskId = i;
      ((f.a)localObject).Amh = ???;
      ((f.a)localObject).Ami = paramc;
      ((f.a)localObject).Amg = paramString;
    }
    while (true)
    {
      synchronized (this.Amc)
      {
        this.Amc.add(localObject);
        paramInt2 = 1933;
        switch (paramInt1)
        {
        default:
          paramInt1 = paramInt2;
          com.tencent.pb.common.c.c.d("NETCMD", new Object[] { "CLTSEND|", Integer.valueOf(i), Integer.valueOf(paramInt1), paramString, com.tencent.pb.a.a.a.dPM() });
          if (this.Amd != null)
            this.Amd.d(i, paramInt1, paramArrayOfByte);
          paramInt1 = i;
        case 139:
        case 141:
        case 145:
        case 181:
        case 143:
        case 183:
        case 147:
        case 189:
        case 211:
        case 221:
        case 223:
        }
      }
      paramInt1 = 1918;
      continue;
      paramInt1 = 1919;
      continue;
      paramInt1 = 1931;
      continue;
      paramInt1 = 1929;
      continue;
      paramInt1 = 1927;
      continue;
      paramInt1 = 1928;
      continue;
      paramInt1 = 1932;
      continue;
      paramInt1 = 1935;
      continue;
      paramInt1 = 1937;
      continue;
      paramInt1 = 1938;
      continue;
      paramInt1 = 1939;
    }
  }

  private static a.v ci(byte[] paramArrayOfByte)
  {
    try
    {
      a.v localv = new com/tencent/pb/common/b/a/a$v;
      localv.<init>();
      paramArrayOfByte = (a.v)com.google.a.a.e.a(localv, paramArrayOfByte, paramArrayOfByte.length);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "Exception genReadPackageData" + paramArrayOfByte.getMessage() });
        paramArrayOfByte = null;
      }
    }
  }

  public static int cj(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "CLTNOT onNotify1 data == null ", Integer.valueOf(0) });
      h.Sq(-1601);
      if ((!TextUtils.isEmpty(com.tencent.wecall.talkroom.model.a.dSR().neq)) || (!TextUtils.isEmpty(com.tencent.wecall.talkroom.model.a.dSR().AJu)))
        com.tencent.wecall.talkroom.model.a.dSR().AJC.aa(new String[] { "notify", "datanull" });
    }
    for (int i = -1; ; i = com.tencent.wecall.talkroom.model.a.dSR().ct(paramArrayOfByte))
    {
      return i;
      h.a(com.tencent.wecall.talkroom.model.a.dSR().nCF, com.tencent.wecall.talkroom.model.a.dSR().sZg, new String[] { "notify", "datanull" });
      break;
      com.tencent.pb.common.c.c.d("NETCMD", new Object[] { "CLTNOT onNotify data len=", Integer.valueOf(paramArrayOfByte.length) });
    }
  }

  private int dPw()
  {
    synchronized (this.Amc)
    {
      this.Amb += 1;
      int i = this.Amb;
      return i;
    }
  }

  public static f dPx()
  {
    if (Ama == null);
    try
    {
      if (Ama == null)
      {
        f localf = new com/tencent/pb/common/b/f;
        localf.<init>();
        Ama = localf;
      }
      return Ama;
    }
    finally
    {
    }
  }

  public final f.a QW(int paramInt)
  {
    while (true)
    {
      synchronized (this.Amc)
      {
        Iterator localIterator = this.Amc.iterator();
        if (localIterator.hasNext())
        {
          f.a locala = (f.a)localIterator.next();
          if (locala.mTaskId != paramInt)
            continue;
          return locala;
        }
      }
      Object localObject2 = null;
    }
  }

  final int a(a parama, c paramc, int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2)
  {
    if (!this.Amf)
    {
      com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "doSendTask mIsInitSucc is false" });
      paramInt1 = -1;
    }
    while (true)
    {
      return paramInt1;
      if (this.Ame == true)
      {
        com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "doSendTask fail: isRefreshing, cmd=" + paramInt1 + ", cmdTag=" + paramString });
        paramInt1 = -1;
      }
      else
      {
        try
        {
          paramInt1 = a(parama, paramc, paramString, paramInt1, paramArrayOfByte, paramInt2);
        }
        catch (Throwable parama)
        {
          com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "Exception doSendTask", parama });
          paramInt1 = -1;
        }
      }
    }
  }

  public final int a(a parama, String paramString, com.google.a.a.e parame)
  {
    try
    {
      i = a(parama, null, 31, paramString, com.google.a.a.e.b(parame), 0);
      return i;
    }
    catch (Exception parama)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "doSendTask exception:", parama });
        int i = -1;
      }
    }
  }

  public final void a(f.a parama, int paramInt, byte[] arg3)
  {
    try
    {
      if (parama.Ami != null)
        parama.Ami.r(paramInt, ???);
      if (parama.Amh != null)
        parama.Amh.eM(parama.Amg, paramInt);
    }
    catch (Exception )
    {
      synchronized (this.Amc)
      {
        this.Amc.remove(parama);
        return;
        ??? = ???;
        com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "postRespData", ???.getMessage() });
      }
    }
  }

  public final int s(int paramInt, byte[] paramArrayOfByte)
  {
    int i = 0;
    f.a locala = QW(paramInt);
    if ((locala == null) && (-1000 != paramInt))
    {
      com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "buf2Resp fail: taskId:" + paramInt + " not found" });
      com.tencent.pb.common.c.f.C(20007, 3, "-1202");
      paramInt = 1;
    }
    while (true)
    {
      return paramInt;
      a.v localv = ci(paramArrayOfByte);
      if ((localv == null) || (localv.AnM == null))
      {
        if (localv == null);
        for (paramArrayOfByte = " pack is null "; ; paramArrayOfByte = " head is " + localv.AnM)
        {
          com.tencent.pb.common.c.c.w("NETCMD", new Object[] { " pack.head: ", paramArrayOfByte });
          a(locala, -3, null);
          paramInt = -1;
          break;
        }
      }
      int j = localv.AnM.ret;
      int k = localv.AnM.AnL;
      paramArrayOfByte = localv.AnM.userName;
      if (com.tencent.pb.common.a.a.Alq)
        Toast.makeText(d.sZj, "retCode: " + j + " debugCode: " + k, 0).show();
      if ((j != 0) && (locala != null))
        com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "CLTRCV", Integer.valueOf(paramInt), locala.Amg, Integer.valueOf(j), paramArrayOfByte, Integer.valueOf(k) });
      while (true)
      {
        paramArrayOfByte = localv.body;
        if (paramArrayOfByte == null)
          break label374;
        a(locala, j, paramArrayOfByte);
        paramInt = i;
        break;
        if (locala != null)
          com.tencent.pb.common.c.c.d("NETCMD", new Object[] { "CLTRCV", Integer.valueOf(paramInt), locala.Amg, Integer.valueOf(j), paramArrayOfByte, Integer.valueOf(k) });
      }
      label374: a(locala, j, null);
      paramInt = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.f
 * JD-Core Version:    0.6.2
 */