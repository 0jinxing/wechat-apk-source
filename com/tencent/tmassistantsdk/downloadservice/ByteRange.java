package com.tencent.tmassistantsdk.downloadservice;

import android.content.res.Resources.NotFoundException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ByteRange
{
  protected static final String BYTES_UNIT = "bytes";
  protected static final Pattern CONTENT_RANGE_HEADER_PATTERN;
  protected static final String INVALID_RANGE_HEADER_REGEX = "((?:\\s*,\\s*(?:\\d*)-(?:\\d*))*)";
  protected static final Pattern RANGE_HEADER_PATTERN;
  protected static final String UNIT_REGEX = "([^=\\s]+)";
  protected static final String VALID_CONTENT_RANGE_HEADER_REGEX = "bytes\\s+(\\d+)-(\\d+)/(\\d+)";
  protected static final String VALID_RANGE_HEADER_REGEX = "([^=\\s]+)\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)";
  protected final Long end;
  protected final long start;

  static
  {
    AppMethodBeat.i(75699);
    RANGE_HEADER_PATTERN = Pattern.compile("^\\s*([^=\\s]+)\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)((?:\\s*,\\s*(?:\\d*)-(?:\\d*))*)\\s*$");
    CONTENT_RANGE_HEADER_PATTERN = Pattern.compile("^\\s*bytes\\s+(\\d+)-(\\d+)/(\\d+)\\s*$");
    AppMethodBeat.o(75699);
  }

  public ByteRange(long paramLong)
  {
    this(paramLong, null);
  }

  public ByteRange(long paramLong1, long paramLong2)
  {
    this(paramLong1, Long.valueOf(paramLong2));
    AppMethodBeat.i(75692);
    IllegalArgumentException localIllegalArgumentException;
    if (paramLong1 < 0L)
    {
      localIllegalArgumentException = new IllegalArgumentException("If end is provided, start must be positive.");
      AppMethodBeat.o(75692);
      throw localIllegalArgumentException;
    }
    if (paramLong2 < paramLong1)
    {
      localIllegalArgumentException = new IllegalArgumentException("end must be >= start.");
      AppMethodBeat.o(75692);
      throw localIllegalArgumentException;
    }
    AppMethodBeat.o(75692);
  }

  protected ByteRange(long paramLong, Long paramLong1)
  {
    this.start = paramLong;
    this.end = paramLong1;
  }

  public static long getTotalSize(String paramString)
  {
    AppMethodBeat.i(75696);
    int i = paramString.indexOf("/");
    if (i == -1)
    {
      paramString = new Resources.NotFoundException();
      AppMethodBeat.o(75696);
      throw paramString;
    }
    long l = bo.anl(paramString.substring(i + 1));
    AppMethodBeat.o(75696);
    return l;
  }

  public static ByteRange parseContentRange(String paramString)
  {
    AppMethodBeat.i(75695);
    Matcher localMatcher = CONTENT_RANGE_HEADER_PATTERN.matcher(paramString);
    if (!localMatcher.matches())
    {
      paramString = new Throwable("Invalid content-range format: ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(75695);
      throw paramString;
    }
    paramString = new ByteRange(bo.anl(localMatcher.group(1)), bo.anl(localMatcher.group(2)));
    AppMethodBeat.o(75695);
    return paramString;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(75698);
    if ((paramObject instanceof ByteRange))
    {
      paramObject = (ByteRange)paramObject;
      if (this.start != paramObject.getStart())
        AppMethodBeat.o(75698);
    }
    while (true)
    {
      return bool;
      if (hasEnd() != paramObject.hasEnd())
      {
        AppMethodBeat.o(75698);
      }
      else if (hasEnd())
      {
        bool = this.end.equals(Long.valueOf(paramObject.getEnd()));
        AppMethodBeat.o(75698);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(75698);
        continue;
        AppMethodBeat.o(75698);
      }
    }
  }

  public long getEnd()
  {
    AppMethodBeat.i(75693);
    if (!hasEnd())
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Byte-range does not have end.  Check hasEnd() before use");
      AppMethodBeat.o(75693);
      throw localIllegalStateException;
    }
    long l = this.end.longValue();
    AppMethodBeat.o(75693);
    return l;
  }

  public long getStart()
  {
    return this.start;
  }

  public boolean hasEnd()
  {
    if (this.end != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public int hashCode()
  {
    AppMethodBeat.i(75697);
    int i = Long.valueOf(this.start).hashCode() + 629;
    int j = i;
    if (this.end != null)
      j = i * 37 + this.end.hashCode();
    AppMethodBeat.o(75697);
    return j;
  }

  public String toString()
  {
    AppMethodBeat.i(75694);
    String str;
    if (this.end != null)
    {
      str = "bytes=" + this.start + "-" + this.end;
      AppMethodBeat.o(75694);
    }
    while (true)
    {
      return str;
      if (this.start < 0L)
      {
        str = "bytes=" + this.start;
        AppMethodBeat.o(75694);
      }
      else
      {
        str = "bytes=" + this.start + "-";
        AppMethodBeat.o(75694);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.ByteRange
 * JD-Core Version:    0.6.2
 */