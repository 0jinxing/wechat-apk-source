package a.i.b.a.c.e.a;

import a.a.e;
import a.a.v;
import java.util.ArrayList;
import java.util.List;

public abstract class a
{
  public static final a.a Bws = new a.a((byte)0);
  public final int Bwp;
  private final List<Integer> Bwq;
  private final int[] Bwr;
  public final int major;
  public final int minor;

  public a(int[] paramArrayOfInt)
  {
    this.Bwr = paramArrayOfInt;
    paramArrayOfInt = e.j(this.Bwr, 0);
    int j;
    if (paramArrayOfInt != null)
    {
      j = paramArrayOfInt.intValue();
      this.major = j;
      paramArrayOfInt = e.j(this.Bwr, 1);
      if (paramArrayOfInt == null)
        break label133;
      j = paramArrayOfInt.intValue();
      label58: this.minor = j;
      paramArrayOfInt = e.j(this.Bwr, 2);
      j = i;
      if (paramArrayOfInt != null)
        j = paramArrayOfInt.intValue();
      this.Bwp = j;
      if (this.Bwr.length <= 3)
        break label138;
    }
    label133: label138: for (paramArrayOfInt = a.a.j.m((Iterable)e.I(this.Bwr).subList(3, this.Bwr.length)); ; paramArrayOfInt = (List)v.AUP)
    {
      this.Bwq = paramArrayOfInt;
      return;
      j = -1;
      break;
      j = -1;
      break label58;
    }
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (a.f.b.j.j(getClass(), paramObject.getClass())) && (this.major == ((a)paramObject).major) && (this.minor == ((a)paramObject).minor) && (this.Bwp == ((a)paramObject).Bwp) && (a.f.b.j.j(this.Bwq, ((a)paramObject).Bwq)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public int hashCode()
  {
    int i = this.major;
    i += i * 31 + this.minor;
    i += i * 31 + this.Bwp;
    return i + (i * 31 + this.Bwq.hashCode());
  }

  public String toString()
  {
    int[] arrayOfInt = this.Bwr;
    Object localObject = new ArrayList();
    int i = arrayOfInt.length;
    int j = 0;
    if (j < i)
    {
      int k = arrayOfInt[j];
      if (k != -1);
      for (int m = 1; ; m = 0)
      {
        if (m == 0)
          break label67;
        ((ArrayList)localObject).add(Integer.valueOf(k));
        j++;
        break;
      }
    }
    label67: localObject = (List)localObject;
    if (((List)localObject).isEmpty());
    for (localObject = "unknown"; ; localObject = a.a.j.a((Iterable)localObject, (CharSequence)".", null, null, 0, null, null, 62))
      return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.a
 * JD-Core Version:    0.6.2
 */