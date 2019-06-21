package c.t.m.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class j
  implements Runnable
{
  private Context a;
  private List<a> b;
  private boolean c;
  private List<a> d;
  private c e;
  private boolean f;

  public j(Context paramContext, List<a> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(136367);
    this.b = null;
    this.c = false;
    this.d = null;
    this.e = null;
    this.f = false;
    this.a = paramContext;
    this.f = paramBoolean;
    this.b = new ArrayList();
    this.b.addAll(paramList);
    this.e = new c(this.a);
    AppMethodBeat.o(136367);
  }

  private boolean a()
  {
    boolean bool = false;
    AppMethodBeat.i(136370);
    Object localObject = b();
    if (localObject == null)
      AppMethodBeat.o(136370);
    while (true)
    {
      return bool;
      byte[] arrayOfByte = ((String)localObject).getBytes();
      if (arrayOfByte != null)
      {
        new HashMap();
        int j;
        for (int i = 0; ; i = j)
        {
          j = i + 1;
          if (i >= 3)
            break label124;
          localObject = p.a("https://cc.map.qq.com?desc_c", arrayOfByte);
          if (localObject != null)
          {
            localObject = new String((byte[])localObject);
            e.a(this.a).a("DRG", "response suc,try:".concat(String.valueOf(j)));
            bool = a((String)localObject);
            AppMethodBeat.o(136370);
            break;
          }
          q.a(10000L);
        }
      }
      label124: AppMethodBeat.o(136370);
    }
  }

  private boolean a(String paramString)
  {
    AppMethodBeat.i(136368);
    paramString = q.c(m.b(paramString, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"));
    boolean bool1;
    if (paramString == null)
    {
      bool1 = true;
      AppMethodBeat.o(136368);
    }
    while (true)
    {
      return bool1;
      this.d = q.b(paramString);
      Object localObject = q.b(this.a, "__bad_dex_info__", "preference_default");
      bool1 = false;
      localObject = q.b((String)localObject);
      if (!((List)localObject).isEmpty())
        bool1 = l.a((List)localObject, this.d);
      boolean bool2 = a(this.b, this.d);
      e.a(this.a).a("DRG", "need and samebad:" + bool2 + "," + bool1);
      if ((!bool2) && (!bool1))
      {
        e.a(this.a).a("DRG", "to download:".concat(String.valueOf(paramString)));
        this.e.a(this.d);
      }
      AppMethodBeat.o(136368);
      bool1 = bool2;
    }
  }

  private boolean a(List<a> paramList1, List<a> paramList2)
  {
    AppMethodBeat.i(136369);
    Iterator localIterator1 = paramList1.iterator();
    boolean bool = true;
    if (localIterator1.hasNext())
    {
      a locala = (a)localIterator1.next();
      Iterator localIterator2 = paramList2.iterator();
      do
      {
        if (!localIterator2.hasNext())
          break;
        paramList1 = (a)localIterator2.next();
        if (!paramList1.c.contains(".dex"))
          paramList1.c += ".dex";
      }
      while ((!locala.c.equals(paramList1.c)) || (locala.d != paramList1.d) || (!locala.e.equals(paramList1.e)));
    }
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        bool = false;
      while (true)
      {
        break;
        AppMethodBeat.o(136369);
        return bool;
      }
    }
  }

  private String b()
  {
    AppMethodBeat.i(136371);
    JSONObject localJSONObject1 = new JSONObject();
    String str2 = this.a.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/comp";
    JSONArray localJSONArray;
    String str1;
    try
    {
      localJSONObject1.put("appkey", q.d(this.a));
      localJSONObject1.put("appversion", q.a(this.a));
      localJSONObject1.put("imei", q.e(this.a));
      localJSONObject1.put("coverSDKver", i.a);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localJSONObject1.put("model", q.b() + "_" + q.a());
      localJSONObject1.put("APILevel", q.c());
      localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      if (this.b != null)
      {
        localObject = this.b.iterator();
        while (((Iterator)localObject).hasNext())
        {
          a locala = (a)((Iterator)localObject).next();
          if (locala != null)
          {
            JSONObject localJSONObject2 = new org/json/JSONObject;
            localJSONObject2.<init>();
            localJSONObject2.put("compId", locala.a);
            localJSONObject2.put("compVer", locala.b);
            localJSONObject2.put("size", locala.d);
            File localFile = new java/io/File;
            localFile.<init>(str2, locala.c);
            localJSONObject2.put("md5", q.a(localFile));
            localJSONArray.put(localJSONObject2);
          }
        }
      }
    }
    catch (Exception localException)
    {
      e.a(this.a).a("DRG", "reqDerror:" + localException.toString());
      str1 = null;
      AppMethodBeat.o(136371);
    }
    while (true)
    {
      return str1;
      str1.put("compList", localJSONArray);
      str1 = str1.toString();
      e.a(this.a).a("DRG", "req:".concat(String.valueOf(str1)));
      str1 = m.a(str1, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q");
      AppMethodBeat.o(136371);
    }
  }

  private boolean c()
  {
    AppMethodBeat.i(136373);
    long l = q.b(this.a, "__last_check_update_time__", Long.valueOf(0L)).longValue();
    boolean bool;
    if (System.currentTimeMillis() - l > 3600000L)
    {
      bool = true;
      AppMethodBeat.o(136373);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136373);
    }
  }

  public void run()
  {
    AppMethodBeat.i(136372);
    if (!this.f);
    try
    {
      Thread.sleep(2000L);
      label19: boolean bool = c();
      e.a(this.a).a("DRG", "t:" + bool + ",i:" + this.f);
      a();
      q.a(this.a, "__last_check_update_time__", Long.valueOf(System.currentTimeMillis()));
      e.a(this.a).c();
      AppMethodBeat.o(136372);
      return;
    }
    catch (Throwable localThrowable)
    {
      break label19;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     c.t.m.c.j
 * JD-Core Version:    0.6.2
 */