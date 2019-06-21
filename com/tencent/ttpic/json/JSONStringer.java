package com.tencent.ttpic.json;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.StringWriter;

public class JSONStringer extends JSONWriter
{
  public JSONStringer()
  {
    super(new StringWriter());
    AppMethodBeat.i(50181);
    AppMethodBeat.o(50181);
  }

  public String toString()
  {
    AppMethodBeat.i(50182);
    String str;
    if (this.mode == 'd')
    {
      str = this.writer.toString();
      AppMethodBeat.o(50182);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(50182);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.json.JSONStringer
 * JD-Core Version:    0.6.2
 */