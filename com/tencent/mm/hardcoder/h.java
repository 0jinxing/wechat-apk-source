package com.tencent.mm.hardcoder;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h
  implements g.a
{
  public static Context context;
  public static int eEJ = -1;
  public static int eEK = -1;
  protected final Map<Integer, a> eEH;
  protected int eEI;

  public h(Context paramContext)
  {
    AppMethodBeat.i(93965);
    this.eEH = new TreeMap();
    this.eEI = 0;
    context = paramContext;
    AppMethodBeat.o(93965);
  }

  private void update()
  {
    AppMethodBeat.i(93968);
    this.eEI = this.eEH.size();
    c.d("HardCoder.PowerConsumption", "update existCpuSize:" + this.eEI);
    AppMethodBeat.o(93968);
  }

  public final void PG()
  {
    AppMethodBeat.i(93966);
    this.eEH.clear();
    try
    {
      Object localObject1 = Build.MODEL;
      if (localObject1 == null)
      {
        AppMethodBeat.o(93966);
        return;
      }
      c.i("HardCoder.PowerConsumption", String.format("[oneliang] device model:%s", new Object[] { localObject1 }));
      localObject1 = ((String)localObject1).toUpperCase();
      localObject2 = context.getAssets().open("hardcoder/power.json");
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = new com/tencent/mm/hardcoder/h$1;
      ((1)localObject4).<init>(this, (StringBuilder)localObject3);
      g.a((InputStream)localObject2, (g.a)localObject4);
      localObject4 = new org/json/JSONObject;
      ((JSONObject)localObject4).<init>(((StringBuilder)localObject3).toString());
      if (((JSONObject)localObject4).has((String)localObject1))
      {
        localObject1 = ((JSONObject)localObject4).getJSONObject((String)localObject1);
        localObject3 = ((JSONObject)localObject1).keys();
        for (int i = 0; ((Iterator)localObject3).hasNext(); i++)
          ((Iterator)localObject3).next();
        int j = 0;
        if ((j < i) && (((JSONObject)localObject1).has("cluster".concat(String.valueOf(j)))))
        {
          localObject3 = ((JSONObject)localObject1).getJSONArray("cluster".concat(String.valueOf(j)));
          for (int k = 0; k < ((JSONArray)localObject3).length(); k++)
            kZ(((JSONArray)localObject3).getString(k));
          update();
          switch (j)
          {
          default:
          case 0:
            while (true)
            {
              j++;
              break;
              eEJ = this.eEI - 1;
            }
          case 1:
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject2;
        Object localObject3;
        Object localObject4;
        c.e("HardCoder.PowerConsumption", "initialize exception:" + localException.getMessage());
        AppMethodBeat.o(93966);
        continue;
        eEK = this.eEI - 1;
        continue;
        c.i("HardCoder.PowerConsumption", String.format("[oneliang] cluster0:%d,cluster1:%d", new Object[] { Integer.valueOf(eEJ), Integer.valueOf(eEK) }));
        Iterator localIterator = this.eEH.entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject4 = (Map.Entry)localIterator.next();
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("config cpu:");
          c.i("HardCoder.PowerConsumption", ((Map.Entry)localObject4).getKey());
          localObject4 = ((a)((Map.Entry)localObject4).getValue()).eEN.entrySet().iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject3 = (Map.Entry)((Iterator)localObject4).next();
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            c.i("HardCoder.PowerConsumption", ((Map.Entry)localObject3).getKey() + "," + ((Map.Entry)localObject3).getValue());
          }
        }
        AppMethodBeat.o(93966);
      }
    }
  }

  public final void PH()
  {
    AppMethodBeat.i(93967);
    this.eEH.clear();
    g.a("/sdcard/power.csv", this);
    update();
    g.a("/sdcard/power1.csv", this);
    Iterator localIterator1 = this.eEH.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      c.i("HardCoder.PowerConsumption", "cpu:" + localEntry.getKey());
      Iterator localIterator2 = ((a)localEntry.getValue()).eEN.entrySet().iterator();
      while (localIterator2.hasNext())
      {
        localEntry = (Map.Entry)localIterator2.next();
        c.i("HardCoder.PowerConsumption", localEntry.getKey() + "," + localEntry.getValue());
      }
    }
    AppMethodBeat.o(93967);
  }

  public final boolean kZ(String paramString)
  {
    AppMethodBeat.i(93969);
    String[] arrayOfString = paramString.trim().split(",");
    if (arrayOfString.length > 0)
    {
      long l = Long.parseLong(arrayOfString[0]);
      int i = 1;
      if (i < arrayOfString.length)
      {
        Integer localInteger = Integer.valueOf(this.eEI + i - 1);
        if (this.eEH.containsKey(localInteger))
          paramString = (a)this.eEH.get(localInteger);
        while (true)
        {
          paramString.eEN.put(Long.valueOf(l), Integer.valueOf(Integer.parseInt(arrayOfString[i], 0)));
          i++;
          break;
          paramString = new a();
          this.eEH.put(localInteger, paramString);
        }
      }
    }
    AppMethodBeat.o(93969);
    return true;
  }

  public static final class a
  {
    public final Map<Long, Integer> eEN;

    public a()
    {
      AppMethodBeat.i(93964);
      this.eEN = new TreeMap();
      AppMethodBeat.o(93964);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.hardcoder.h
 * JD-Core Version:    0.6.2
 */