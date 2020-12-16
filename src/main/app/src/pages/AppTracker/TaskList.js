import React from "react";
import Grid from "@material-ui/core/Grid";
import Image from "../../assets/images/trakinator_tasklist.png";
const TaskList = () => {
  return (
    <div>
      <Grid container spacing={24}>
        <img src={Image} alt="This Feature is Coming very soon" />
      </Grid>
    </div>
  );
};

export default TaskList;
