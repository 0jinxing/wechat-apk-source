package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import java.lang.annotation.Annotation;

public abstract interface SafeParcelable extends Parcelable
{
  public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

  public static @interface Class
  {
    public abstract String creator();

    public abstract boolean validate();
  }

  public static @interface Constructor
  {
  }

  public static @interface Field
  {
    public abstract String defaultValue();

    public abstract String defaultValueUnchecked();

    public abstract String getter();

    public abstract int id();

    public abstract String type();
  }

  public static @interface Indicator
  {
    public abstract String getter();
  }

  public static @interface Param
  {
    public abstract int id();
  }

  public static @interface Reserved
  {
    public abstract int[] value();
  }

  public static @interface VersionField
  {
    public abstract String getter();

    public abstract int id();

    public abstract String type();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.safeparcel.SafeParcelable
 * JD-Core Version:    0.6.2
 */