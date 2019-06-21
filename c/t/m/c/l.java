package c.t.m.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class l
{
  public static void a(Context paramContext)
  {
    AppMethodBeat.i(136377);
    try
    {
      Object localObject = new java/io/File;
      ((File)localObject).<init>(paramContext.getFilesDir(), "TencentLocation/odex");
      if (!((File)localObject).exists())
        ((File)localObject).mkdirs();
      if ((!((File)localObject).canRead()) || (!((File)localObject).canWrite()) || (!((File)localObject).canExecute()))
      {
        boolean bool1 = ((File)localObject).setReadable(true);
        boolean bool2 = ((File)localObject).setWritable(true);
        boolean bool3 = ((File)localObject).setExecutable(true);
        paramContext = e.a();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("ods:");
        paramContext.a("DMK", bool2 + "_" + bool1 + "_" + bool3);
        paramContext = ((File)localObject).listFiles();
        if ((paramContext != null) && (paramContext.length > 0))
        {
          int i = 0;
          if (i < paramContext.length)
          {
            localObject = paramContext[i];
            if ((!((File)localObject).canRead()) || (!((File)localObject).canWrite()) || (!((File)localObject).canExecute()))
            {
              bool3 = ((File)localObject).setWritable(true);
              bool2 = ((File)localObject).setReadable(true);
              bool1 = ((File)localObject).setExecutable(true);
              localObject = e.a();
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("ofs:");
              ((e)localObject).a("DMK", bool3 + "_" + bool2 + "_" + bool1);
            }
            while (true)
            {
              i++;
              break;
              e.a().a("DMK", "ofs:ok");
            }
          }
        }
      }
    }
    catch (Throwable paramContext)
    {
      e.a().a("DMK", "exp:" + paramContext.toString());
      AppMethodBeat.o(136377);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(136377);
      continue;
      e.a().a("DMK", "ods:ok");
      AppMethodBeat.o(136377);
    }
  }

  public static boolean a(List<a> paramList1, List<a> paramList2)
  {
    AppMethodBeat.i(136380);
    Iterator localIterator = paramList1.iterator();
    boolean bool = true;
    if (localIterator.hasNext())
    {
      a locala1 = (a)localIterator.next();
      if (!locala1.c.contains(".dex"))
        locala1.c += ".dex";
      paramList1 = paramList2.iterator();
      a locala2;
      do
      {
        if (!paramList1.hasNext())
          break;
        locala2 = (a)paramList1.next();
        if (!locala2.c.contains(".dex"))
          locala2.c += ".dex";
      }
      while ((!locala1.c.equals(locala2.c)) || (locala1.d != locala2.d) || (!locala1.e.equals(locala2.e)));
    }
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        bool = false;
      while (true)
      {
        break;
        AppMethodBeat.o(136380);
        return bool;
      }
    }
  }

  public static boolean b(Context paramContext)
  {
    AppMethodBeat.i(136378);
    boolean bool;
    if (!q.b(paramContext, "__SP_LAST_TencentLoc_COMP_SDK_VER__", "").equals(i.a))
    {
      bool = false;
      AppMethodBeat.o(136378);
    }
    while (true)
    {
      return bool;
      String str = q.b(paramContext, "__SP_LAST_TencentLoc_COMP_INFO__", "");
      e.a(paramContext).a("DBC", str);
      if ((str == null) || (str.equals("")))
      {
        bool = false;
        AppMethodBeat.o(136378);
      }
      else
      {
        List localList = q.b(str);
        if ((localList == null) || (localList.isEmpty()))
        {
          bool = false;
          AppMethodBeat.o(136378);
        }
        else
        {
          Object localObject1 = new byte[2048];
          str = paramContext.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/comp";
          Object localObject2 = paramContext.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/lastComp";
          ArrayList localArrayList = new ArrayList();
          Object localObject3 = localList.iterator();
          int i = 1;
          while (((Iterator)localObject3).hasNext())
          {
            Object localObject4 = (a)((Iterator)localObject3).next();
            if (!q.b(paramContext, (String)localObject2 + File.separator + ((a)localObject4).c, str, "tmp_backup_" + ((a)localObject4).c, ((a)localObject4).d, (byte[])localObject1))
            {
              localObject4 = new File(str + File.separator + "tmp_backup_" + ((a)localObject4).c);
              if ((((File)localObject4).exists()) && (((File)localObject4).isFile()))
                ((File)localObject4).delete();
              i = 0;
            }
            else
            {
              localArrayList.add(localObject4);
            }
          }
          if (i == 0)
          {
            paramContext = localArrayList.iterator();
            while (paramContext.hasNext())
            {
              localObject2 = (a)paramContext.next();
              localObject2 = new File(str + File.separator + "tmp_backup_" + ((a)localObject2).c);
              if ((((File)localObject2).exists()) && (((File)localObject2).isFile()))
                ((File)localObject2).delete();
            }
            localArrayList.clear();
            bool = false;
            AppMethodBeat.o(136378);
          }
          else if (localList.size() == localArrayList.size())
          {
            localObject1 = localArrayList.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (a)((Iterator)localObject1).next();
              localObject2 = new File(str, ((a)localObject3).c);
              if ((((File)localObject2).exists()) && (((File)localObject2).isFile()))
                ((File)localObject2).delete();
              new File(str, "tmp_backup_" + ((a)localObject3).c).renameTo((File)localObject2);
            }
            str = q.a(localArrayList);
            q.a(paramContext, "__SP_Tencent_Loc_COMP_INFO__", str);
            e.a(paramContext).a("DBC", str);
            bool = true;
            AppMethodBeat.o(136378);
          }
          else
          {
            bool = false;
            AppMethodBeat.o(136378);
          }
        }
      }
    }
  }

  public static boolean c(Context paramContext)
  {
    AppMethodBeat.i(136379);
    String str1 = q.b(paramContext);
    q.e(str1);
    Object localObject1 = q.b(q.b(paramContext, "TencentLocationComp" + File.separator + "comp_list"));
    byte[] arrayOfByte = new byte[2048];
    Object localObject2 = new ArrayList();
    Iterator localIterator = ((List)localObject1).iterator();
    Object localObject3;
    Object localObject4;
    int i;
    if (localIterator.hasNext())
    {
      localObject3 = (a)localIterator.next();
      localObject4 = "TencentLocationComp" + File.separator + ((a)localObject3).c;
      ((a)localObject3).c += ".dex";
      String str2 = "tmp_asset_" + ((a)localObject3).c;
      if (!q.a(paramContext, (String)localObject4, str1, str2, ((a)localObject3).d, arrayOfByte))
      {
        localObject3 = new File(str1 + File.separator + str2);
        if ((!((File)localObject3).exists()) || (!((File)localObject3).isFile()))
          break label511;
        ((File)localObject3).delete();
        i = 0;
      }
    }
    while (true)
    {
      if (i == 0)
      {
        paramContext = ((ArrayList)localObject2).iterator();
        while (true)
        {
          boolean bool;
          if (paramContext.hasNext())
          {
            localObject1 = (a)paramContext.next();
            localObject1 = new File(str1 + File.separator + "tmp_asset_" + ((a)localObject1).c);
            if ((((File)localObject1).exists()) && (((File)localObject1).isFile()))
            {
              ((File)localObject1).delete();
              continue;
              ((ArrayList)localObject2).add(localObject3);
              break;
            }
          }
        }
        AppMethodBeat.o(136379);
        bool = false;
      }
      while (true)
      {
        return bool;
        if (((ArrayList)localObject2).size() == ((List)localObject1).size())
        {
          localObject3 = ((ArrayList)localObject2).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject4 = (a)((Iterator)localObject3).next();
            localObject2 = new File(str1, ((a)localObject4).c);
            if ((((File)localObject2).exists()) && (((File)localObject2).isFile()))
              ((File)localObject2).delete();
            new File(str1, "tmp_asset_" + ((a)localObject4).c).renameTo((File)localObject2);
          }
          q.a(paramContext, "__SP_Tencent_Loc_COMP_INFO__", q.a((List)localObject1));
          AppMethodBeat.o(136379);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(136379);
          bool = false;
        }
      }
      label511: i = 0;
      continue;
      i = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     c.t.m.c.l
 * JD-Core Version:    0.6.2
 */