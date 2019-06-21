package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class v<K extends Comparable<K>, V> extends AbstractMap<K, V>
{
  private List<v<K, V>.b> BAA;
  private Map<K, V> BAB;
  private volatile v<K, V>.d BAC;
  private final int BAz;
  boolean BzD;

  private v(int paramInt)
  {
    AppMethodBeat.i(121644);
    this.BAz = paramInt;
    this.BAA = Collections.emptyList();
    this.BAB = Collections.emptyMap();
    AppMethodBeat.o(121644);
  }

  static <FieldDescriptorType extends h.a<FieldDescriptorType>> v<FieldDescriptorType, Object> UE(int paramInt)
  {
    // Byte code:
    //   0: ldc 67
    //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 7	a/i/b/a/c/g/v$1
    //   8: dup
    //   9: iload_0
    //   10: invokespecial 68	a/i/b/a/c/g/v$1:<init>	(I)V
    //   13: astore_1
    //   14: ldc 67
    //   16: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: aload_1
    //   20: areturn
  }

  private V UG(int paramInt)
  {
    AppMethodBeat.i(121655);
    eiH();
    Object localObject = ((v.b)this.BAA.remove(paramInt)).getValue();
    if (!this.BAB.isEmpty())
    {
      Iterator localIterator = eiI().entrySet().iterator();
      this.BAA.add(new v.b(this, (Map.Entry)localIterator.next()));
      localIterator.remove();
    }
    AppMethodBeat.o(121655);
    return localObject;
  }

  private void eiH()
  {
    AppMethodBeat.i(121658);
    if (this.BzD)
    {
      UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
      AppMethodBeat.o(121658);
      throw localUnsupportedOperationException;
    }
    AppMethodBeat.o(121658);
  }

  private SortedMap<K, V> eiI()
  {
    AppMethodBeat.i(121659);
    eiH();
    if ((this.BAB.isEmpty()) && (!(this.BAB instanceof TreeMap)))
      this.BAB = new TreeMap();
    SortedMap localSortedMap = (SortedMap)this.BAB;
    AppMethodBeat.o(121659);
    return localSortedMap;
  }

  private void eiJ()
  {
    AppMethodBeat.i(121660);
    eiH();
    if ((this.BAA.isEmpty()) && (!(this.BAA instanceof ArrayList)))
      this.BAA = new ArrayList(this.BAz);
    AppMethodBeat.o(121660);
  }

  private int f(K paramK)
  {
    AppMethodBeat.i(121656);
    int i = 0;
    int j = this.BAA.size() - 1;
    int k;
    if (j >= 0)
    {
      k = paramK.compareTo(((v.b)this.BAA.get(j)).BAF);
      if (k > 0)
      {
        j = -(j + 2);
        AppMethodBeat.o(121656);
      }
      while (true)
      {
        return j;
        if (k != 0)
          break;
        AppMethodBeat.o(121656);
      }
    }
    while (true)
    {
      if (i <= j)
      {
        k = (i + j) / 2;
        int m = paramK.compareTo(((v.b)this.BAA.get(k)).BAF);
        if (m < 0)
        {
          j = k - 1;
          continue;
        }
        if (m > 0)
        {
          i = k + 1;
          continue;
        }
        AppMethodBeat.o(121656);
        j = k;
        break;
      }
      j = -(i + 1);
      AppMethodBeat.o(121656);
      break;
    }
  }

  public final Map.Entry<K, V> UF(int paramInt)
  {
    AppMethodBeat.i(121647);
    Map.Entry localEntry = (Map.Entry)this.BAA.get(paramInt);
    AppMethodBeat.o(121647);
    return localEntry;
  }

  public final V a(K paramK, V paramV)
  {
    AppMethodBeat.i(121652);
    eiH();
    int i = f(paramK);
    if (i >= 0)
    {
      paramK = ((v.b)this.BAA.get(i)).setValue(paramV);
      AppMethodBeat.o(121652);
    }
    while (true)
    {
      return paramK;
      eiJ();
      i = -(i + 1);
      if (i >= this.BAz)
      {
        paramK = eiI().put(paramK, paramV);
        AppMethodBeat.o(121652);
      }
      else
      {
        if (this.BAA.size() == this.BAz)
        {
          v.b localb = (v.b)this.BAA.remove(this.BAz - 1);
          eiI().put(localb.BAF, localb.getValue());
        }
        this.BAA.add(i, new v.b(this, paramK, paramV));
        paramK = null;
        AppMethodBeat.o(121652);
      }
    }
  }

  public void clear()
  {
    AppMethodBeat.i(121653);
    eiH();
    if (!this.BAA.isEmpty())
      this.BAA.clear();
    if (!this.BAB.isEmpty())
      this.BAB.clear();
    AppMethodBeat.o(121653);
  }

  public boolean containsKey(Object paramObject)
  {
    AppMethodBeat.i(121650);
    paramObject = (Comparable)paramObject;
    boolean bool;
    if ((f(paramObject) >= 0) || (this.BAB.containsKey(paramObject)))
    {
      bool = true;
      AppMethodBeat.o(121650);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121650);
    }
  }

  public final int eiF()
  {
    AppMethodBeat.i(121646);
    int i = this.BAA.size();
    AppMethodBeat.o(121646);
    return i;
  }

  public final Iterable<Map.Entry<K, V>> eiG()
  {
    AppMethodBeat.i(121648);
    Object localObject;
    if (this.BAB.isEmpty())
    {
      localObject = v.a.eiK();
      AppMethodBeat.o(121648);
    }
    while (true)
    {
      return localObject;
      localObject = this.BAB.entrySet();
      AppMethodBeat.o(121648);
    }
  }

  public void eii()
  {
    AppMethodBeat.i(121645);
    if (!this.BzD)
      if (!this.BAB.isEmpty())
        break label44;
    label44: for (Map localMap = Collections.emptyMap(); ; localMap = Collections.unmodifiableMap(this.BAB))
    {
      this.BAB = localMap;
      this.BzD = true;
      AppMethodBeat.o(121645);
      return;
    }
  }

  public Set<Map.Entry<K, V>> entrySet()
  {
    AppMethodBeat.i(121657);
    if (this.BAC == null)
      this.BAC = new v.d(this, (byte)0);
    v.d locald = this.BAC;
    AppMethodBeat.o(121657);
    return locald;
  }

  public V get(Object paramObject)
  {
    AppMethodBeat.i(121651);
    paramObject = (Comparable)paramObject;
    int i = f(paramObject);
    if (i >= 0)
    {
      paramObject = ((v.b)this.BAA.get(i)).getValue();
      AppMethodBeat.o(121651);
    }
    while (true)
    {
      return paramObject;
      paramObject = this.BAB.get(paramObject);
      AppMethodBeat.o(121651);
    }
  }

  public V remove(Object paramObject)
  {
    AppMethodBeat.i(121654);
    eiH();
    paramObject = (Comparable)paramObject;
    int i = f(paramObject);
    if (i >= 0)
    {
      paramObject = UG(i);
      AppMethodBeat.o(121654);
    }
    while (true)
    {
      return paramObject;
      if (this.BAB.isEmpty())
      {
        paramObject = null;
        AppMethodBeat.o(121654);
      }
      else
      {
        paramObject = this.BAB.remove(paramObject);
        AppMethodBeat.o(121654);
      }
    }
  }

  public int size()
  {
    AppMethodBeat.i(121649);
    int i = this.BAA.size();
    int j = this.BAB.size();
    AppMethodBeat.o(121649);
    return i + j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.v
 * JD-Core Version:    0.6.2
 */