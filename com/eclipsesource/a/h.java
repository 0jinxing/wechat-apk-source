package com.eclipsesource.a;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;

public abstract class h
  implements Serializable
{

  @Deprecated
  public static final h aLi = a.aLi;

  @Deprecated
  public static final h aLj = a.aLj;

  @Deprecated
  public static final h aLk = a.aLk;

  public final String a(l paraml)
  {
    StringWriter localStringWriter = new StringWriter();
    if (paraml == null)
      try
      {
        paraml = new java/lang/NullPointerException;
        paraml.<init>("config is null");
        throw paraml;
      }
      catch (IOException paraml)
      {
        throw new RuntimeException(paraml);
      }
    m localm = new com/eclipsesource/a/m;
    localm.<init>(localStringWriter);
    a(paraml.a(localm));
    localm.flush();
    return localStringWriter.toString();
  }

  abstract void a(i parami);

  public boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }

  public int hashCode()
  {
    return super.hashCode();
  }

  public boolean isArray()
  {
    return false;
  }

  public boolean isBoolean()
  {
    return false;
  }

  public boolean isNumber()
  {
    return false;
  }

  public boolean isObject()
  {
    return false;
  }

  public boolean isString()
  {
    return false;
  }

  public b oN()
  {
    throw new UnsupportedOperationException("Not an array: " + toString());
  }

  public boolean oO()
  {
    throw new UnsupportedOperationException("Not a boolean: " + toString());
  }

  public int oP()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }

  public long oQ()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }

  public double oR()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }

  public e oS()
  {
    throw new UnsupportedOperationException("Not an object: " + toString());
  }

  public String pq()
  {
    throw new UnsupportedOperationException("Not a string: " + toString());
  }

  public String toString()
  {
    return a(l.aLN);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.h
 * JD-Core Version:    0.6.2
 */