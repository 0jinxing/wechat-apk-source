package com.tencent.sqlitelint.behaviour.alert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.sqlitelint.SQLiteLintIssue;
import com.tencent.sqlitelint.util.SLog;
import com.tencent.sqlitelint.util.SQLiteLintUtil;

public class IssueDetailActivity extends SQLiteLintBaseActivity
{
  public static final String KEY_ISSUE = "issue";
  private static final String TAG = "MicroMsg.IssueDetailActivity";

  private void initView(final SQLiteLintIssue paramSQLiteLintIssue)
  {
    AppMethodBeat.i(94065);
    if (paramSQLiteLintIssue == null)
      AppMethodBeat.o(94065);
    while (true)
    {
      return;
      setTitle(getString(2131305871));
      Object localObject1 = (TextView)findViewById(2131820988);
      Object localObject2 = (TextView)findViewById(2131820989);
      ((TextView)localObject1).setText(SQLiteLintUtil.formatTime("yyyy-MM-dd HH:mm", paramSQLiteLintIssue.createTime));
      ((TextView)localObject2).setText(SQLiteLintIssue.getLevelText(paramSQLiteLintIssue.level, getBaseContext()));
      if (!SQLiteLintUtil.isNullOrNil(paramSQLiteLintIssue.desc))
      {
        localObject1 = (LinearLayout)findViewById(2131820990);
        ((TextView)findViewById(2131820991)).setText(paramSQLiteLintIssue.desc);
        ((LinearLayout)localObject1).setVisibility(0);
        ((LinearLayout)localObject1).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(94062);
            SLog.v("MicroMsg.IssueDetailActivity", paramSQLiteLintIssue.desc.replace("%", "###"), new Object[0]);
            AppMethodBeat.o(94062);
          }
        });
      }
      if (!SQLiteLintUtil.isNullOrNil(paramSQLiteLintIssue.detail))
      {
        localObject2 = (LinearLayout)findViewById(2131820992);
        localObject1 = (TextView)findViewById(2131820993);
        ((TextView)localObject1).setText(paramSQLiteLintIssue.detail);
        ((LinearLayout)localObject2).setVisibility(0);
        ((TextView)localObject1).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(94063);
            SLog.v("MicroMsg.IssueDetailActivity", paramSQLiteLintIssue.detail.replace("%", "###"), new Object[0]);
            AppMethodBeat.o(94063);
          }
        });
      }
      if (!SQLiteLintUtil.isNullOrNil(paramSQLiteLintIssue.advice))
      {
        localObject1 = (LinearLayout)findViewById(2131820994);
        ((TextView)findViewById(2131820995)).setText(paramSQLiteLintIssue.advice);
        ((LinearLayout)localObject1).setVisibility(0);
      }
      if (!SQLiteLintUtil.isNullOrNil(paramSQLiteLintIssue.extInfo))
      {
        localObject1 = (LinearLayout)findViewById(2131820996);
        ((TextView)findViewById(2131820997)).setText(getString(2131305872, new Object[] { paramSQLiteLintIssue.extInfo }));
        ((LinearLayout)localObject1).setVisibility(0);
      }
      AppMethodBeat.o(94065);
    }
  }

  protected int getLayoutId()
  {
    return 2130968624;
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(94064);
    super.onCreate(paramBundle);
    initView((SQLiteLintIssue)getIntent().getParcelableExtra("issue"));
    AppMethodBeat.o(94064);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.behaviour.alert.IssueDetailActivity
 * JD-Core Version:    0.6.2
 */