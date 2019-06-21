package c.t.m.c;

import android.annotation.TargetApi;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b
{
  private static b c = null;
  private Context a;
  private List<a> b;

  private b(Context paramContext)
  {
    AppMethodBeat.i(136326);
    this.b = null;
    this.a = paramContext;
    this.b = new ArrayList();
    AppMethodBeat.o(136326);
  }

  public static b a(Context paramContext, List<a> paramList)
  {
    AppMethodBeat.i(136327);
    if (c == null)
      c = new b(paramContext);
    c.a(paramList);
    paramContext = c;
    AppMethodBeat.o(136327);
    return paramContext;
  }

  private b a(List<a> paramList)
  {
    try
    {
      AppMethodBeat.i(136328);
      this.b.clear();
      this.b.addAll(paramList);
      AppMethodBeat.o(136328);
      return this;
    }
    finally
    {
      paramList = finally;
    }
    throw paramList;
  }

  @TargetApi(3)
  private DexClassLoader b()
  {
    while (true)
    {
      Object localObject4;
      String str;
      StringBuilder localStringBuilder;
      Object localObject5;
      try
      {
        AppMethodBeat.i(136329);
        l.a(this.a);
        if ((this.b == null) || (this.b.size() <= 0))
        {
          AppMethodBeat.o(136329);
          localObject1 = null;
          return localObject1;
        }
        q.b = q.a(this.b);
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject4 = this.a.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/comp";
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        str = this.a.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/odex";
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject5 = this.b.iterator();
        if (((Iterator)localObject5).hasNext())
        {
          localObject1 = (a)((Iterator)localObject5).next();
          if (localObject1 == null)
            continue;
          localStringBuilder.append((String)localObject4);
          localStringBuilder.append(File.separator);
          localStringBuilder.append(((a)localObject1).c);
          localStringBuilder.append(File.pathSeparator);
          continue;
        }
      }
      finally
      {
      }
      try
      {
        System.currentTimeMillis();
        DexClassLoader localDexClassLoader1 = new dalvik/system/DexClassLoader;
        localDexClassLoader1.<init>(localStringBuilder.toString(), str, (String)localObject4, getClass().getClassLoader());
        locale = e.a(this.a);
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>("suc:");
        locale.a("CPL", q.b);
        AppMethodBeat.o(136329);
      }
      catch (Exception localException)
      {
        e locale = e.a(this.a);
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>("fail:");
        locale.a("CPL", q.b + ",exc:" + localException.toString());
        l.a(this.a);
        try
        {
          System.currentTimeMillis();
          DexClassLoader localDexClassLoader2 = new dalvik/system/DexClassLoader;
          localDexClassLoader2.<init>(localStringBuilder.toString(), str, (String)localObject4, getClass().getClassLoader());
          localObject4 = e.a(this.a);
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("suc:c");
          ((e)localObject4).a("CPL", q.b);
          AppMethodBeat.o(136329);
        }
        catch (Throwable localThrowable)
        {
          AppMethodBeat.o(136329);
          Object localObject3 = null;
        }
      }
    }
  }

  public DexClassLoader a()
  {
    AppMethodBeat.i(136330);
    int i = 0;
    Object localObject3;
    for (Object localObject1 = null; ; localObject1 = localObject3)
    {
      int j = i + 1;
      Object localObject2 = localObject1;
      if (i < 3);
      while (true)
      {
        try
        {
          localObject2 = b();
          localObject1 = localObject2;
          e.a().a("CPL", "lcn:".concat(String.valueOf(j)));
          if (localObject2 == null)
            break;
          AppMethodBeat.o(136330);
          return localObject2;
        }
        catch (Throwable localThrowable)
        {
          e.a().a("CPL", "fail:" + localThrowable.toString());
          localObject3 = localObject1;
        }
        AppMethodBeat.o(136330);
      }
      i = j;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     c.t.m.c.b
 * JD-Core Version:    0.6.2
 */