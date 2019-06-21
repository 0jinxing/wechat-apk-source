package c.t.m.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class h
{
  private Context a;

  public h(Context paramContext)
  {
    this.a = paramContext;
  }

  private List<String> c()
  {
    AppMethodBeat.i(136362);
    Object localObject = new File(this.a.getFilesDir(), "TencentLocation/comp");
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = localArrayList1;
    if (((File)localObject).exists())
    {
      localArrayList2 = localArrayList1;
      if (((File)localObject).isDirectory())
      {
        localObject = ((File)localObject).listFiles();
        localArrayList2 = localArrayList1;
        if (localObject != null)
        {
          localArrayList2 = localArrayList1;
          if (localObject.length > 0)
          {
            localArrayList1 = new ArrayList();
            int i = localObject.length;
            for (int j = 0; ; j++)
            {
              localArrayList2 = localArrayList1;
              if (j >= i)
                break;
              localArrayList2 = localObject[j];
              localArrayList1.add(localArrayList2.getName() + "," + localArrayList2.length() + "," + q.a(localArrayList2));
            }
          }
        }
      }
    }
    AppMethodBeat.o(136362);
    return localArrayList2;
  }

  public void a()
  {
    AppMethodBeat.i(136360);
    if (!d.a(this.a).a("backup"))
    {
      AppMethodBeat.o(136360);
      return;
    }
    b();
    Object localObject1 = c();
    Object localObject2 = q.b(q.b(this.a, "__SP_Tencent_Loc_COMP_INFO__", ""));
    if ((localObject1 == null) || (((List)localObject1).size() == 0) || (((List)localObject2).size() == 0))
      i = 0;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    int j;
    label176: Object localObject7;
    while (true)
      if (i != 0)
      {
        localObject1 = new byte[2048];
        localObject3 = this.a.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/comp";
        localObject4 = this.a.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/lastComp";
        localObject5 = new ArrayList();
        localObject6 = ((List)localObject2).iterator();
        j = 0;
        while (true)
          if (((Iterator)localObject6).hasNext())
          {
            localObject7 = (a)((Iterator)localObject6).next();
            Object localObject8 = new File((String)localObject4, ((a)localObject7).c);
            if (((File)localObject8).exists())
            {
              localObject8 = q.a((File)localObject8);
              if (((a)localObject7).e.equals(localObject8));
            }
            else if (q.b(this.a, (String)localObject3 + File.separator + ((a)localObject7).c, (String)localObject4, "tmp_" + ((a)localObject7).c, ((a)localObject7).d, (byte[])localObject1))
            {
              ((List)localObject5).add(localObject7);
              continue;
              localObject3 = ((List)localObject2).iterator();
              j = 1;
              label334: i = j;
              if (!((Iterator)localObject3).hasNext())
                break;
              localObject6 = (a)((Iterator)localObject3).next();
              localObject4 = ((List)localObject1).iterator();
              do
              {
                if (!((Iterator)localObject4).hasNext())
                  break;
                localObject5 = ((String)((Iterator)localObject4).next()).split(",");
              }
              while ((localObject5.length != 3) || (!((a)localObject6).c.equals(localObject5[0])) || (!String.valueOf(((a)localObject6).d).equals(localObject5[1])) || (!((a)localObject6).e.equals(localObject5[2])));
            }
          }
      }
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        j = 0;
      while (true)
      {
        break label334;
        localObject7 = new File((String)localObject4 + File.separator + "tmp_" + ((a)localObject7).c);
        if ((((File)localObject7).exists()) && (((File)localObject7).isFile()))
          ((File)localObject7).delete();
        j = 1;
        break label176;
        if (j != 0)
        {
          localObject2 = ((List)localObject5).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject5 = (a)((Iterator)localObject2).next();
            localObject5 = new File((String)localObject4 + File.separator + "tmp_" + ((a)localObject5).c);
            if ((((File)localObject5).exists()) && (((File)localObject5).isFile()))
              ((File)localObject5).delete();
          }
        }
        if (((List)localObject2).size() == ((List)localObject5).size())
        {
          localObject3 = ((List)localObject5).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject6 = (a)((Iterator)localObject3).next();
            localObject2 = new File((String)localObject4, ((a)localObject6).c);
            if ((((File)localObject2).exists()) && (((File)localObject2).isFile()))
              ((File)localObject2).delete();
            new File((String)localObject4, "tmp_" + ((a)localObject6).c).renameTo((File)localObject2);
          }
          localObject4 = q.a((List)localObject5);
          q.a(this.a, "__SP_LAST_TencentLoc_COMP_INFO__", (String)localObject4);
          q.a(this.a, "__SP_LAST_TencentLoc_COMP_SDK_VER__", i.a);
        }
        d.a(this.a).b("backup");
        AppMethodBeat.o(136360);
        break;
      }
    }
  }

  public void b()
  {
    AppMethodBeat.i(136361);
    File localFile = new File(this.a.getFilesDir(), "TencentLocation/lastComp");
    if (!localFile.exists())
      localFile.mkdirs();
    AppMethodBeat.o(136361);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     c.t.m.c.h
 * JD-Core Version:    0.6.2
 */