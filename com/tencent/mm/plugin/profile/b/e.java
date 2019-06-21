package com.tencent.mm.plugin.profile.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.i;
import com.tencent.mm.ay.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.Map;

public final class e extends a
{
  public String pkI = null;
  public int status = 0;
  public String username = null;

  public e(Map<String, String> paramMap)
  {
    super(paramMap);
  }

  public e(Map<String, String> paramMap, bi parambi)
  {
    super(paramMap, parambi);
  }

  public static int UL(String paramString)
  {
    AppMethodBeat.i(23292);
    g.RQ();
    Object localObject1 = (String)g.RP().Ry().get(ac.a.xJE, "");
    ab.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactByWework() climsgid:%s", new Object[] { paramString });
    int i;
    if (bo.isNullOrNil((String)localObject1))
    {
      AppMethodBeat.o(23292);
      i = 1;
    }
    while (true)
    {
      return i;
      try
      {
        Object localObject2 = new com/tencent/mm/aa/i;
        ((i)localObject2).<init>((String)localObject1);
        localObject1 = ((i)localObject2).optString("svrids");
        localObject2 = ((i)localObject2).optString("states");
        localObject1 = ((String)localObject1).split(",");
        localObject2 = ((String)localObject2).split(",");
        if ((localObject1 == null) || (localObject2 == null))
        {
          AppMethodBeat.o(23292);
          i = 1;
        }
        else
        {
          for (i = 0; ; i++)
            while (true)
            {
              if (i >= localObject1.length)
                break label187;
              boolean bool = bo.isEqual(paramString, localObject1[i]);
              if (bool)
                try
                {
                  i = Integer.valueOf(localObject2[i]).intValue();
                  AppMethodBeat.o(23292);
                }
                catch (NumberFormatException paramString)
                {
                  while (true)
                  {
                    ab.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactByWework() Exception:%s", new Object[] { paramString.getMessage() });
                    i = 0;
                  }
                }
            }
          label187: AppMethodBeat.o(23292);
          i = 1;
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactByWework() Exception:%s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(23292);
        i = 1;
      }
    }
  }

  public static boolean UM(String paramString)
  {
    AppMethodBeat.i(23293);
    g.RQ();
    Object localObject1 = (String)g.RP().Ry().get(ac.a.xJF, "");
    ab.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactUsernameByWework() username:%s", new Object[] { paramString });
    boolean bool;
    if (bo.isNullOrNil((String)localObject1))
    {
      AppMethodBeat.o(23293);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        Object localObject2 = new com/tencent/mm/aa/i;
        ((i)localObject2).<init>((String)localObject1);
        localObject1 = ((i)localObject2).optString("usernames");
        localObject2 = ((i)localObject2).optString("states");
        localObject1 = ((String)localObject1).split(",");
        localObject2 = ((String)localObject2).split(",");
        if ((localObject1 == null) || (localObject2 == null))
        {
          AppMethodBeat.o(23293);
          bool = false;
        }
        else
        {
          for (int i = 0; ; i++)
            while (true)
            {
              if (i >= localObject1.length)
                break label237;
              bool = bo.isEqual(paramString, localObject1[i]);
              if (bool)
                try
                {
                  j = Integer.valueOf(localObject2[i]).intValue();
                  if (!bo.gW(j, 2))
                  {
                    bool = bo.gW(j, 3);
                    if (!bool);
                  }
                  else
                  {
                    AppMethodBeat.o(23293);
                    bool = true;
                  }
                }
                catch (NumberFormatException localNumberFormatException)
                {
                  int j;
                  while (true)
                  {
                    ab.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactUsernameByWework() Exception:%s", new Object[] { localNumberFormatException.getMessage() });
                    j = 0;
                  }
                  bool = bo.gW(j, 1);
                  if (bool)
                  {
                    AppMethodBeat.o(23293);
                    bool = false;
                  }
                }
            }
          label237: AppMethodBeat.o(23293);
          bool = false;
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactUsernameByWework() Exception:%s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(23293);
        bool = false;
      }
    }
  }

  private static void cO(String paramString, int paramInt)
  {
    AppMethodBeat.i(23291);
    g.RQ();
    String str1 = (String)g.RP().Ry().get(ac.a.xJF, "");
    ab.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactUsernameByWework() username:%s state:%s ", new Object[] { paramString, Integer.valueOf(paramInt) });
    try
    {
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (!bo.isNullOrNil(str1))
      {
        localObject1 = new com/tencent/mm/aa/i;
        ((i)localObject1).<init>(str1);
        str1 = ((i)localObject1).optString("usernames");
        localObject1 = ((i)localObject1).optString("states");
        localObject2 = str1.split(",");
        localObject3 = ((String)localObject1).split(",");
        if ((localObject2 == null) || (localObject3 == null))
          break label420;
        i = 0;
        if (i >= localObject2.length)
          break label420;
        if (bo.isEqual(paramString, localObject2[i]))
        {
          localObject3[i] = String.valueOf(paramInt);
          i = 1;
          localObject2 = new com/tencent/mm/aa/i;
          ((i)localObject2).<init>();
          if (i != 0)
            break label296;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str1 = str1 + "," + paramString;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject1 = (String)localObject1 + "," + paramInt;
        }
      }
      while (true)
      {
        ((i)localObject2).g("usernames", str1);
        ((i)localObject2).g("states", localObject1);
        ab.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactUsernameByWework() result:%s", new Object[] { paramString, Integer.valueOf(paramInt), ((i)localObject2).toString() });
        g.RQ();
        g.RP().Ry().set(ac.a.xJF, ((i)localObject2).toString());
        AppMethodBeat.o(23291);
        return;
        i++;
        break;
        label296: localObject1 = "";
        int j = localObject3.length;
        for (i = 0; i < j; i++)
        {
          String str2 = localObject3[i];
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject1 = (String)localObject1 + str2 + ",";
        }
        localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
        continue;
        localObject2 = new com/tencent/mm/aa/i;
        ((i)localObject2).<init>();
        localObject1 = String.valueOf(paramInt);
        str1 = paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactUsernameByWework() Exception:%s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(23291);
        continue;
        label420: int i = 0;
      }
    }
  }

  public final boolean Yt()
  {
    AppMethodBeat.i(23290);
    boolean bool;
    if (this.values == null)
    {
      ab.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "[parseXml] values == null ");
      AppMethodBeat.o(23290);
      bool = false;
      return bool;
    }
    ab.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "[parseXml] type:%s, values size:%s", new Object[] { bo.nullAsNil(this.TYPE), Integer.valueOf(this.values.size()) });
    String str1;
    int i;
    String str2;
    if ((!bo.isNullOrNil(this.TYPE)) && (this.TYPE.equalsIgnoreCase("NewXmlOpenIMFriReqAcceptedInWxWork")))
    {
      if (this.values.containsKey(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.username"))
        this.username = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.username"));
      if (this.values.containsKey(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.climsgid"))
        this.pkI = bo.nullAsNil((String)this.values.get(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.climsgid"));
      if (this.values.containsKey(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.climsgid"))
        this.status = bo.getInt((String)this.values.get(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.status"), 0);
      ab.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "username:%s climsgid:%s status:%s", new Object[] { this.username, this.pkI, Integer.valueOf(this.status) });
      str1 = this.pkI;
      i = this.status;
      g.RQ();
      str2 = (String)g.RP().Ry().get(ac.a.xJE, "");
      ab.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactByWework() climsgid:%s state:%s ", new Object[] { str1, Integer.valueOf(i) });
    }
    while (true)
    {
      try
      {
        if (!bo.isNullOrNil(str2))
        {
          localObject1 = new com/tencent/mm/aa/i;
          ((i)localObject1).<init>(str2);
          str2 = ((i)localObject1).optString("svrids");
          localObject1 = ((i)localObject1).optString("states");
          localObject2 = str2.split(",");
          Object localObject3 = ((String)localObject1).split(",");
          if ((localObject2 == null) || (localObject3 == null))
            break label721;
          j = 0;
          if (j >= localObject2.length)
            break label721;
          if (bo.isEqual(str1, localObject2[j]))
          {
            localObject3[j] = String.valueOf(i);
            j = 1;
            localObject2 = new com/tencent/mm/aa/i;
            ((i)localObject2).<init>();
            if (j != 0)
              continue;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            str2 = str2 + "," + str1;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject1 = (String)localObject1 + "," + i;
            ((i)localObject2).g("svrids", str2);
            ((i)localObject2).g("states", localObject1);
            ab.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactByWework() result:%s", new Object[] { str1, Integer.valueOf(i), ((i)localObject2).toString() });
            g.RQ();
            g.RP().Ry().set(ac.a.xJE, ((i)localObject2).toString());
            cO(this.username, this.status);
            AppMethodBeat.o(23290);
            bool = true;
            break;
          }
          j++;
          continue;
          localObject1 = "";
          int k = localObject3.length;
          j = 0;
          if (j < k)
          {
            String str3 = localObject3[j];
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localObject1 = (String)localObject1 + str3 + ",";
            j++;
            continue;
          }
          localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
          continue;
        }
        Object localObject2 = new com/tencent/mm/aa/i;
        ((i)localObject2).<init>();
        Object localObject1 = String.valueOf(i);
        str2 = str1;
        continue;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactByWework() Exception:%s", new Object[] { localException.getMessage() });
        continue;
      }
      ab.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "[parseXml] type err :%s", new Object[] { bo.nullAsNil(this.TYPE) });
      AppMethodBeat.o(23290);
      bool = false;
      break;
      label721: int j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.b.e
 * JD-Core Version:    0.6.2
 */