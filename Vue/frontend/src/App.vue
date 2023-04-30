<template>
  <v-app>
    <v-app-bar
      app
      color="primary"
      dark
    >
      <div class="d-flex align-center">
        <span style="font-size: 20px; color: white;">KDT - Study - 4 Product Page</span>
      </div>

      <v-spacer></v-spacer>

      <v-btn
        href="https://github.com/EDDI-RobotAcademy/KDT-Study-4"
        target="_blank"
        text
      >
        <span class="mr-2" style="color: white;">GitHub</span>
        <v-icon>mdi-open-in-new</v-icon>
      </v-btn>
    </v-app-bar>
    <v-main>
      <router-view/>
    </v-main>
  </v-app>
</template>

<script>

export default {
  name: 'App',

  data: () => ({
    //
  }),
};
</script>
