package com.tencent.matrix.c;

import org.json.JSONObject;

public final class b
{
  public Integer bWu;
  public JSONObject bWv;
  public com.tencent.matrix.b.b bWw;
  public String key;
  public String tag;

  public b()
  {
  }

  public b(int paramInt)
  {
    this.bWu = Integer.valueOf(paramInt);
  }

  public b(JSONObject paramJSONObject)
  {
    this.bWv = paramJSONObject;
  }

  public final String toString()
  {
    return String.format("tag[%s]type[%d];key[%s];content[%s]", new Object[] { this.tag, this.bWu, this.key, this.bWv });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.c.b
 * JD-Core Version:    0.6.2
 */