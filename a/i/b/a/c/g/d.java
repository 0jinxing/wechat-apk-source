package a.i.b.a.c.g;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class d
  implements Iterable<Byte>
{
  public static final d Bzq;

  static
  {
    if (!d.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      Bzq = new p(new byte[0]);
      return;
    }
  }

  public static d A(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return new p(arrayOfByte);
  }

  private static d a(Iterator<d> paramIterator, int paramInt)
  {
    assert (paramInt > 0);
    if (paramInt == 1);
    int i;
    for (paramIterator = (d)paramIterator.next(); ; paramIterator = a(paramIterator, i).a(a(paramIterator, paramInt - i)))
    {
      return paramIterator;
      i = paramInt >>> 1;
    }
  }

  public static d awc(String paramString)
  {
    try
    {
      paramString = new p(paramString.getBytes("UTF-8"));
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
    }
    throw new RuntimeException("UTF-8 not supported?", paramString);
  }

  public static d cx(byte[] paramArrayOfByte)
  {
    return A(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public static d.b ehS()
  {
    return new d.b();
  }

  public static d w(Iterable<d> paramIterable)
  {
    if (!(paramIterable instanceof Collection))
    {
      ArrayList localArrayList = new ArrayList();
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
        localArrayList.add((d)paramIterable.next());
      paramIterable = localArrayList;
      if (!paramIterable.isEmpty())
        break label75;
    }
    label75: for (paramIterable = Bzq; ; paramIterable = a(paramIterable.iterator(), paramIterable.size()))
    {
      return paramIterable;
      paramIterable = (Collection)paramIterable;
      break;
    }
  }

  public final d a(d paramd)
  {
    int i = size();
    int j = paramd.size();
    if (i + j >= 2147483647L)
      throw new IllegalArgumentException(53 + "ByteString would be too long: " + i + "+" + j);
    return u.a(this, paramd);
  }

  final void a(OutputStream paramOutputStream, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
      throw new IndexOutOfBoundsException(30 + "Source offset < 0: " + paramInt1);
    if (paramInt2 < 0)
      throw new IndexOutOfBoundsException(23 + "Length < 0: " + paramInt2);
    if (paramInt1 + paramInt2 > size())
      throw new IndexOutOfBoundsException(39 + "Source end offset exceeded: " + (paramInt1 + paramInt2));
    if (paramInt2 > 0)
      b(paramOutputStream, paramInt1, paramInt2);
  }

  protected abstract int aR(int paramInt1, int paramInt2, int paramInt3);

  protected abstract int aS(int paramInt1, int paramInt2, int paramInt3);

  abstract void b(OutputStream paramOutputStream, int paramInt1, int paramInt2);

  public final String dlY()
  {
    try
    {
      String str = toString("UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("UTF-8 not supported?", localUnsupportedEncodingException);
    }
  }

  public abstract d.a ehP();

  public abstract boolean ehQ();

  public abstract e ehR();

  protected abstract int ehT();

  protected abstract boolean ehU();

  protected abstract int ehV();

  public final void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < 0)
      throw new IndexOutOfBoundsException(30 + "Source offset < 0: " + paramInt1);
    if (paramInt2 < 0)
      throw new IndexOutOfBoundsException(30 + "Target offset < 0: " + paramInt2);
    if (paramInt3 < 0)
      throw new IndexOutOfBoundsException(23 + "Length < 0: " + paramInt3);
    if (paramInt1 + paramInt3 > size())
      throw new IndexOutOfBoundsException(34 + "Source end offset < 0: " + (paramInt1 + paramInt3));
    if (paramInt2 + paramInt3 > paramArrayOfByte.length)
      throw new IndexOutOfBoundsException(34 + "Target end offset < 0: " + (paramInt2 + paramInt3));
    if (paramInt3 > 0)
      g(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
  }

  protected abstract void g(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);

  public abstract int size();

  public final byte[] toByteArray()
  {
    int i = size();
    byte[] arrayOfByte;
    if (i == 0)
      arrayOfByte = j.EMPTY_BYTE_ARRAY;
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = new byte[i];
      g(arrayOfByte, 0, 0, i);
    }
  }

  public String toString()
  {
    return String.format("<ByteString@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()) });
  }

  public abstract String toString(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.d
 * JD-Core Version:    0.6.2
 */